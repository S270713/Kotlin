fun main(args: Array<String>) {
    //Быстрая сортировка ч-з итерации
    quiksort()
    //Рекурсия. 6 параметров
    recursiya6()
}

//Быстрая сортировка ч-з итерации
fun quiksort (){
    var ms=emptyArray<Int>()
    var msnach=emptyArray<Int>()
    var msContr=emptyArray<Int>()
    var msItog=emptyArray<Int>()
    var ms1=emptyArray<Int>()
    var ms2=emptyArray<Int>()
    var ms3const=emptyArray<Int>()
    var ms4const=emptyArray<Int>()
    var rnds:Int
    var i=0
    var kNach=0
    var kKon=0
    var k=0
    //набор массива
    for (k in 0..9){
        rnds = (0..9).random()
        ms+=rnds
        msContr+=0
    }
    msContr[msContr.size-1]=1
    println("Быстрая сортировка (итерации):")
    for (i in 0..(ms.size-1)){
        msnach+=ms[i]
        print(ms[i])
    }
    println()
    k=0
    while ((msContr.contains(0))==true){
        kNach=0
        kKon=0
        k=0
        //находим нач. и кон.знач.
        while ((msContr[k])!=0){
            k++
        }
        kNach=k
        k++
        while ((msContr[k])!=1){
            k++
        }
        kKon=k
        //необх.сохр.ннеизменяемо
        if (kNach>0) {
            for (k in 0..kNach-1){
                ms3const+=ms[k]
            }
        }
        if (msContr.size-1>kKon) {
            for (k in kKon+1..msContr.size-1){
                ms4const+=ms[k]
            }
        }
        //находим крит.знач
        var znSer=(ms[kNach]+ms[(kKon)])/2
        println()
        //анализ
        for (i in kNach..kKon){
            if ((ms[i])<=znSer) {
                ms1+=ms[i]
            }
            else{
                ms2+=ms[i]
            }
        }
        if (ms2?.isEmpty()){
            msContr[ms3const.size+ms1.size-2]=1
        }
        else{
            msContr[ms3const.size+ms1.size-1]=1
        }
        //вывод подмаподмассивов
        ms=emptyArray<Int>()
        ms=ms3const+ms1+ms2+ms4const
        ms1=emptyArray<Int>()
        ms2=emptyArray<Int>()
        ms3const=emptyArray<Int>()
        ms4const=emptyArray<Int>()
        for (i in 0..(ms.size-1)){
            print(ms[i])
        }
    }
}
//КОНЕЦ - Быстрая сорт.ч-з итерации

//Рекурсия. 6 параметров
fun recursiya6() {
    println()
    println()
    println ("            Рекурсия:")
    println ("""Параметры: 
x = 10; y = 125; z = 1000; x1 = 2; y1 = 17; z1 = 300.""")
    println ("""Формула:
x*y+z+f()""")
    println ("""Шаг рекурсии:
x1+2,y1-1,z1*2.""")
    println ("""Базис рекурсии: 
(x1>5) or (y1<=10) or (z1>1500).""")
    println ("""Остаточный член: 
99.""")
    val x = 10
    val y = 125
    val z = 1000
    val x1 = 2
    val y1 = 17
    val z1 = 300
    val res = f(x, y, z, x1, y1, z1)
    println ()
    println ("Результат: $res")
}

fun f(x:Int, y:Int, z:Int, x1:Int, y1:Int, z1:Int): Int {
    if ((x1>5) or (y1<=10) or (z1>1500))
        return 99
    else
        return (x*y+z+f(x,y,z,x1+2,y1-1,z1*2))
}