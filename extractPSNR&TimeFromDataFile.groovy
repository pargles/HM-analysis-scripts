def files = []
files.add("Output-offline-trees-hm12-original-qp32.txt")

boolean summary = false

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
           println ""
       }
       
       if(summary){
           if(!line.isEmpty())  println line
       }
    }

}





return