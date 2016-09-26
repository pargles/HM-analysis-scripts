def files = []
files.add("Output-online-trees-hm12-qp32.txt")

boolean summary = false

int cuSize = 64

files.each{ fileName ->
    
    println fileName

    new File(fileName).eachLine{ line ->
    
       if(line.contains("Input          File")){
           println line
       }
       
       if(line.contains("SUMMARY")){
           summary = true
       }
       
       if(line.contains("I Slices")){
           summary = false
       }
       
       if(line.contains("Total Time:")){
           println line
           println "\n\n"
       }
       
       if(summary){
           if(!line.isEmpty())  println line
       }
       
       if(line.contains("Evaluation on training data")){
       
           //restarts counter again if CU size = 8
            if(cuSize <= 8) cuSize = 64
       
           int trainedCUs = line.findAll( /\d+/ ).first().toInteger()
          println "  ${cuSize}x${cuSize} trained CUs: ${trainedCUs}" 
       }
       
       if(line.contains("Time:")){
            
            println "  ${cuSize}x${cuSize} Time to build model: ${line.replace("Time: ","")}"
           cuSize = cuSize - cuSize/2
       }
       //example: 7  319(12.5%)
       if(line.contains("%)")){
       
           //example: (12.5%)
           def correctTrained = line.findAll( /\(.*\)/ ).first()
           correctTrained = correctTrained.replace('(','').replace(')','').replace('%','')
           correctTrained = Double.parseDouble(correctTrained)
           correctTrained = 100 - correctTrained
          println "  ${cuSize}x${cuSize} correct trained: ${correctTrained}"
       }
    }

}

return