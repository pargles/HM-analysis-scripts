def file = new File("/home/pargles/Documents/HM-analysis-scripts/Output-online-trees-hm12-with10TimesPenalty-qp32.txt")

def output = new File("/home/pargles/Documents/HM-analysis-scripts/frame-by-frame-Output-onlinr-trees-with-10-penalty.csv")

file.eachLine{ line ->

    if(line.contains("Input          File ")){
        println line
        output << line + "\n"
    }

    if(line.contains("POC")){
        //println line
        def tokens = line.split(" ")
        
        tokens.each{
                
           if(it != ""){
            output << it+","
           } 
        }
        output << "\n"
    }

}

return