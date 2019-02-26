 object Main {
 def main(args: Array[String]) {
     println ("Podaj ile chcesz wczytac napisow:")
     var n = io.StdIn.readInt()
     println ("Podaj napisy do wpisania do tablicy")

     var napisy = new Array[String](n)

        var i = 0
        var m = 0
        var x = "xyz"
        var z = 0
        var o = 0


        while (i < n) {
            napisy(i) = io.StdIn.readLine()
            i += 1
        }


    while (m < n){
        while (o < n-1){
            while (z < n-1){
                if(napisy (z).length < napisy (z+1).length){
                    x = napisy (z)
                    napisy (z) = napisy (z+1)
                    napisy (z+1) = x
                }
            }
            z += 1
        }
        o += 1
    }
    m += 1

    m = 0
    println("Podane napisy w kolejnosci rosnacej dlugosci:")
    while (m < n){
        println (napisy(m))
        m += 1
    }
 }  
}