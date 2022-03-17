fun main(){
    cumpus("CodeHive")
   var y= numumbers(20,3)
    println(y)
    var c= fact("Zurich",20)
    println(c)
    var r=sentence("I find assesments tricky")
    println(r)
}
fun cumpus(text:String){
    var f=text[4].toString()+text[5]+text[6]+text[7]
    println(f)

}
fun numumbers(num1:Int,num2:Int):Int{
    var x= num1%num2
    return x
}
fun fact(name:String,age:Int):String{
    var t="Hi,my name is $name and I am $age years old."
    return t
}
fun sentence(character:String):Int{
    var s=character.length
    return s
}