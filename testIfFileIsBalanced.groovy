String baseFilePath = "/home/pargles/Documents/codificador/HM-12.0/"

String f64 ="C5hevc_64x64.data"
String f32 ="C5hevc_32x32.data"
String f16 ="C5hevc_16x16.data"

def lines = 0
def split = 0
new File("${baseFilePath}${f64}").eachLine{ line ->
    
    lines ++
    def splitOrNot = Integer.parseInt( line.split(",").last() )
    split += splitOrNot
}

println lines - split
println "split: ${split} (${split/lines}%) not split: ${lines-split} (${(lines-split)/lines}%) lines: ${lines}"
lines = split = 0

new File("${baseFilePath}${f32}").eachLine{ line ->
    
    lines ++
    def splitOrNot = Integer.parseInt( line.split(",").last() )
    split += splitOrNot
}

println lines - split
println "split: ${split} (${split/lines}%) not split: ${lines-split} (${(lines-split)/lines}%) lines: ${lines}"
lines = split = 0

new File("${baseFilePath}${f16}").eachLine{ line ->
    
    lines ++
    def splitOrNot = Integer.parseInt( line.split(",").last() )
    split += splitOrNot
}

println lines - split
println "split: ${split} (${split/lines}%) not split: ${lines-split} (${(lines-split)/lines}%) lines: ${lines}"
lines = split = 0

return