fun main(args: Array<String>) {

    /*БЛОК РАБОТЫ С МАССИВАМИ*/
    bmassiv1()
    bmassiv2perebor()
    bmassiv3sortirovka()
    bmassiv4poisk()

    /*БЛОК  ЛЯМБДА*/
    lmbd()

    /*БЛОК РАБОТЫ СО СТРОКАМИ*/
    stroki()
    strokireplace()

    //БЛОК МАССИВЫ
    mass()
    mass2()
    mass3()

    //ПИРАМИДА
    piram()

    //Вложенный класс
    vlogen()
    innerclass()
    vlogenclassfunk()
    vlogenclassfunk2()
    vlogenfunk3()

    //Блок  this
    Bthis()

    // Работа с классами
    BlClass()

    // Блок Функция возвращ.значение.
    fvz()
}

/*БЛОК РАБОТЫ С МАССИВАМИ*/

/*Часть 1. Работа с массивами*/
fun bmassiv1(){
    println ("         1.Работа с массивами:")
    var ms10=IntArray(1000)
    val ms1= arrayOf<Int>(1,2,3)
    val ms2= arrayOf(4,5,6)
    val mss=ms2+ms1//сумма массивов
    var k=mss.size
    print ("Массив 1:  ")
    for (i in 0..ms1.size-1){
        print (ms1[i])
    }
    println()
    print ("Массив 2:  ")
    for (i in 0..ms2.size-1){
        print (ms2[i])
    }
    println()
    println ("Размер двух массивов: $k")
    print ("Состав массива:  ")
    for (i in 0..k-1){
        print (mss[i])
    }
    println()
    print("Сумма членов:   ")
    for (j in 0..2){
        ms10[j]=ms1[j]+ms2[j]
        print (ms10[j])
    }
    println()
    var z1=mss.min()
    var z2=mss.max()
    println("Min: $z1")
    println("Max: $z2")
}
/*Конец Части 1*/

/*Перебор массива*/
fun bmassiv2perebor(){
    println()
    println("          2.Перебор массива")
    var ms3= arrayOf (10,20,30)
    for (i in ms3){
        print("Элемент $i  ")
    }
    println()
    ms3.forEachIndexed {index, element-> println ("Индекс: $index  -  Элемент: $element")}
}
/*конец перебора*/

/*Сортировка*/
fun bmassiv3sortirovka(){
    println()
    println("          3.Сортировка")
    val ms4 = arrayOf(10,30,60,20,40)
    ms4.forEachIndexed {ind,elem->println("$ind : $elem")}
    println ("Doing sort:")
    ms4.sort()
    ms4.forEachIndexed {ind,elem->println("$ind : $elem")}
}
/*Конец сортировки*/

// Поиск элемента в массиве
fun bmassiv4poisk(){
    println()
    println("        4.Поиск элемента")
    val ms5 = arrayOf (10,20,30,40)
    for(i in 0..ms5.size-1){
        print(ms5[i])
        print(" ")
    }
    val isContains = ms5.contains(40)
    println()
    println ("40 в списке?  $isContains")
}
/*Конец поиска*/
/*КОНЕЦ БЛОКА РАБОТЫ С МАССИВАМИ*/

/*БЛОК  ЛЯМБДА*/
fun lmbd(){
    println()
    println ("             1.Лямбда")
    val mk = Array (10,{i->i*3})
    for (i in 0..mk.size-1){
        print (mk[i])
        print(" ")
    }
}
/*КОНЕЦ БЛОКА ЛЯМБДА*/

/*БЛОК РАБОТЫ СО СТРОКАМИ*/
fun stroki(){
    println()
    println()
    println ("              1.Строки")
    val catname: String="Cat"
    println ("Hello $catname")
    println()
    val gorod: String="Ленинград"
    println(gorod)
    val bukva = gorod[5]
    println("Буква 6: $bukva")
    println()
    for (char in gorod){
        println(char)
    }
    println()

    for (char in catname.toCharArray()){
        println(char)
    }
    println("---")
    catname.forEach{char->println(char)}
    println("---")
    catname.forEachIndexed{ind,char->println("Индекс $ind Символ $char")}
    println()
    val indx= 6
    val indx2=indx+1
    println("Character at index $indx2 in $gorod is ${gorod[indx]}")
    println()
    val a: Int=3
    val b: Int=6
    println ("Сумма равна: ${a+b}")
    println()
    val fantas = arrayListOf("Mur")
    fantas.add("Myay")
    fantas.add("Tim")
    println ("Кота зовут: ${fantas[2]}")
    println()
    var tt=335
    println(tt)
    println("Значение: ${if (tt == 33) "три три" else "три три пять"}")
    println()
    val ryba="Кит"
    val ryba1=ryba.padStart(10,'*')
    val ryba2=ryba.padEnd(10,'!')
    println(ryba)
    println (ryba1)
    println (ryba2)
    println()
    /*ПОДБЛОК СТРОКИ УРОВЕНЬ 2*/
    stroki_yr2()
    /*КОНЕЦ ПОДБЛОК СТРОКИ УРОВЕНЬ 2*/
}
/*КОНЕЦ БЛОКА СТРОКИ*/

//БЛОК СТРОКИ 2 REPLACE
fun strokireplace() {
    println()
    println("             Строки 2 Replace")
    var x:Int
    x=1
    var y:Int=2
    var c:Int
    c=x+y
    println(c)
    c+=1
    println(c)
    y-=2
    println(y)
    var a = 1 // просто имя переменной
    val s1 = "a равно $a"
    a = 2 // произвольное выражение в
    val s2 = "${s1.replace("равно", "было равно")}, но теперь равно $a"
    println (s2)
    println()
    val d1="Пиитер Москва Питер Москва"
    val d2="${d1.replace("Москва", "Омск")}"
    println(d1)
    println(d2)
}
// КОНЕЦ БЛОК СТРОКИ 2 REPLACE

/*ПОДБЛОК СТРОКИ УРОВЕНЬ 2*/
fun stroki_yr2(){
    println("    Строки (also; StringBuilder; run)")
    /*var a=555
    var b=888
    println ("a= $a")
    println ("b= $b")
    println()
    a=b.also{b=a}
    println ("a= $a")
    println ("b= $b")*/
    println()
    val game: String = StringBuilder().also {
        it.append("TIC ")
        it.append("TAC ")
        it.append("TUC")
    }
        .toString()
    println(game)
    println()
    var q=7777
    println (q)
    run {
        var q=9999
        println (q)
    }
    println (q)
}
/*КОНЕЦ ПОДБЛОК СТРОКИ УРОВЕНЬ 2*/

//МАССИВЫ. первый
fun mass() {
    println()
    println("              1.Массив")
    println()
    println("Random array:")
    var n=5
    var m=5
    var rnds = (0..9).random()
    var ms = Array(n,{IntArray(m)})
    //Заполняем массив
    for (i in 0..4){
        for (j in 0..4){
            rnds = (0..9).random()
            ms [i][j]=rnds
        }
    }
    //Выводим массив
    for (i in 0..4){
        for (j in 0..4){
            print(ms[i][j])
        }
        println()
    }
    println()
    //Ищем все пятерки
    var pr=0
    println("Find a place of 5")
    for (i in 0..4){
        for (j in 0..4){
            if (ms[i][j]==5){
                println ("Строка ${i+1} Столбец ${j+1} Цифра ${ms[i][j]}")
                pr=1
            }
        }
    }
    //komm. bez 5
    if (pr==0){
        println ("Пятерок нет")
    }
    println()
    /* Отсортиреум массив методом пузырька*/
    var kk=0
    //for (kk in 25..1){//С Больш.Цикл.Откр
    println("Сортировка методом Пузырька - поднимаем одну цифру:")
    var m_vrem=0
    var ch_krai=0
    // ААА For Откр.
    for (i in 0..4){//Пересчет строк
        // АА Усл.Откр.
        if ((i>0) and (ch_krai==3)){
            // А Условие откр.
            if (ms[i][0]<ms[i-1][4]){
                m_vrem=ms[i-1][4]
                ms[i-1][4]=ms[i][0]
                ms[i][0]=m_vrem
            }// А Условие закр.

            ch_krai=0
        }// АА Усл.Закр.
        //ВВВ For Откр.
        for (j in 0..3){//Пересч столб

            ch_krai=j
            //ВВ Усл.Откр.
            if (ms[i][j+1]<ms[i][j]){
                ms[i][j+1]=ms[i][j+1]+ms[i][j]
                ms[i][j]=ms[i][j+1]-ms[i][j]
                ms[i][j+1]=ms[i][j+1]-ms[i][j]
            }//ВВ Усл.Закр.
        }// ВВВ For Закр.
    }// ААА For Закр.
    // }// С Больш.Цикл.Закр.
    //Выводим массив
    for (i in 0..4){
        for (j in 0..4){
            print(ms[i][j])
        }
        println()
    }
}
// Конец блока МАССИВЫ первый

// Массивы. блок 2
fun mass2() {
    println()
    println("         2.Массив. Вывод координат.")
    //A open
    var n=5
    var m=5
    var rnds = (0..9).random()
    var ms = Array(n,{IntArray(m)})
    //Заполняем массив
    //B open
    for (i in 0..4){
        //BB open
        for (j in 0..4){
            rnds = (0..9).random()
            ms [i][j]=rnds
        }//BB close
    }//B close
    //Выводим массив
    //C open
    for (i in 0..4){
        //CC open
        for (j in 0..4){
            print(ms[i][j])
        }//CC close
        println()
    }//C close
    println()

    //ПУЗЫРЬКОМ
    var sz=25
    var i=0//# строки
    var j=0//# столбца
    var iend=0//# посл.коорд.
    var jend=0//# посл.коорд.
    //D open
    for (sz in 25 downTo 1){
        //DD open
        when(sz){
            in 21..25 -> {i=5;j=sz-20}
            in 16..20 -> {i=4;j=sz-15}
            in 11..15 -> {i=3;j=sz-10}
            in 6..10 -> {i=2;j=sz-5}
            in 1..5 -> {i=1;j=sz}
            else -> "Ошибка"
            // println (i)
        }//DD close
        print (i)
        println (j)
    }//D close
}//A closе
// Конец.// Массивы. блок 2

// Массив 3. Пузырьком
//A open
fun mass3() {
    println()
    println("         3.Массив. Пузырек.")
    var n=5
    var m=5
    var rnds = (0..9).random()
    var ms = Array(n,{IntArray(m)})
    //Заполняем массив
    //B open
    for (i in 0..4){
        //BB open
        for (j in 0..4){
            rnds = (0..9).random()
            ms [i][j]=rnds
        }//BB close
    }//B close

    //Выводим массив
    //C open
    for (i in 0..4){
        //CC open
        for (j in 0..4){
            print(ms[i][j])
        }//CC close
        println()
    }//C close
    println()

    //ПУЗЫРЬКОМ
    var ms1mer = IntArray(26)//вр масс
    var k=0//индекс ms1mer
    var i=0//# строки
    var j=0//# столбца
    //D open
    /*преобразуем двумерный массив в одномерный*/
    for (i in 0..4){
        //DD open
        for (j in 0..4){
            ms1mer[k]=ms[i][j]
            k++
            //print(ms[i][j])
            print(ms1mer[k-1])
        }//DD close
    }//D close

    //сортир одномерного масс пузыр
    //E open
    var kk=24
    var t=0
    var m_vrem=0
    for (kk in 24 downTo 0){
        //EE open
        for (t in 0..24){
            //EEE open
            if (ms1mer[t]>ms1mer[t+1]){
                m_vrem=ms1mer[t]
                ms1mer[t]=ms1mer[t+1]
                ms1mer[t+1]=m_vrem
            }///EEE close
        }//EE close
    }//E close
    println()
    //вывод 1 мерного массива
    //F open
    for (tr in 0..24){
        println ("$tr rav ${ms1mer[tr]}")
    }
    //F close

}//A close
//   КОНЕЦ   // Массив 3. Пузырьком

//Пирамида
fun piram() {
    println()
    println("               Пирамида")
    val rows = 9
    for (i in rows downTo 1) {
        for (kk in 1..rows - i) {
            print(" ")
        }
        for (j in i..2 * i - 1) {
            print("* ")
        }
        for (j in 0..i - 1 - 1) {
            print("* ")
        }
        println()
    }
}
// Конец   Пирамида

// БЛОК Вложенный класс
fun vlogen() {
    println()
    println("             1.Вложенные классы")
    val per=d1.d2().f1()
    println ("Вложенный")
    println (per)
}
class d1{
    val br=1
    class d2 {
        fun f1()="класс"
    }
}
// Конец блока вложенный класс

//Вложенный внутренний класс 2
fun innerclass() {
    println()
    println("      2.Внутренний класс (вложенный.внутренний)")
    val per=d11().d21().f2()
    println ("Inner")
    println (per)
}
class d11{
    val br="класс 2"
    inner class d21 {
        fun f2()=br
    }
}
//конец блока влож внутр класс

//Блок вложенн классы и функ.
fun vlogenclassfunk() {
    println()
    println("      3. Вложенный класс и функция")
    val x=a1.a2().f1()
    println(x)
    val y=a1.a2.a3().f()
    println(y)
    val z=a1.a2.a3.a4.a5().f2()
    println(z)
}
class a1(){
    class a2(){
        fun f1()="вложение 2 уровня"
        class a3(){
            fun f()="вложение 3 уровня"
            class a4(){
                class a5(){
                    fun f2()="вложение 5 уровня"
                }
            }
        }
    }
}
//Конец Блок вложенн классы и функ.

//Блок вложен класс и функ 2
fun vlogenclassfunk2() {
    println()
    println("         4.Вложенный класс и функция 2")
    val pr=c1().c2().k()
    println(pr)
    val prer=c1().c2().c3().kk()
    println(prer)
}
class c1(){
    val t=100
    val tt=49
    inner class c2(){
        fun k()=t
        val rr=151
        inner class c3(){
            fun kk()=tt+rr
        }
    }
}
// Конец Блок вложен класс и функ 2

// Блок вложенные функции 3
fun vlogenfunk3() {
    println()
    println("            5. Вложенная функция 3")
    f10()
}
fun f1(){
    println("2- переход f1")
    f9()
}
fun f2(){
    println ("4- переход f2")
    f8()
}
fun f3(){
    println ("6- переход f3")
    f7()
}
fun f4(){
    println ("8- переход f4")
    f6()
}
fun f5(){
    println ("10- переход f5-last")
}
fun f6(){
    println ("9- переход f6")
    f5()
}
fun f7(){
    println ("7- переход f7")
    f4()
}
fun f8(){
    println ("5- переход f8")
    f3()
}
fun f9(){
    println ("3- переход f9")
    f2()
}
fun f10(){
    println ("1- переход f10")
    f1()
}
// КОНЕЦ Блок вложенные функции 3

//  БЛОК this
fun Bthis() {
    println()
    println("             Блок  this")
    println(Human(19).isSimilarAge(19))
    println(Human2(20).isSimilarAge2(19))
}
class Human(var age:Int){
    fun isSimilarAge(age: Int):Boolean=this.age==age
}
class Human2(var age3:Int){
    fun isSimilarAge2(age4: Int):Boolean=this.age3==age4
}
// Конец блока this

//      Блок РАБОТА С КЛАССАМИ
fun BlClass() {
    println()
    println("            1.Работа s CLASS")
    println()
    val tom: Person = Person()
    val kate: Person = Person()
    val tim: Person = Person()
    val barsik = Cat("barsik",4)
    println("${barsik.name} ${barsik.age}")
    chess()
}
fun chess(){
    println()
    println("       Сравниваем chess fields:")
    println("(class - сравнение ссылок.  data class - сравнение содержимого)")
    println()
    println("class:")
    val field1=Square(4,5)
    val field2=Square(4,5)
    println("field1: ${field1.column} ${field1.row}")
    println("field2: ${field2.column} ${field2.row}")
    println(field1==field2)
    println()
    println("data class:")
    val field1New=SquareNew(4,5)
    val field2New=SquareNew(4,5)
    println(field1New)
    println(field2New)
    println(field1New==field2New)
}
class Person
class Cat(val name: String, val age: Int)
class Square(val column:Int, val row:Int)
data class SquareNew(val columnNew:Int, val rowNew:Int)
//    конец  Блок РАБОТА С КЛАССАМИ

// Блок Функция возвращ.значение.
fun fvz(){
    println()
    println("            FUN Возвращает значение")
    println("Поиск max: a=2, b=1")
    println(maxx(2, 1))
}
fun maxx(a: Int, b: Int): Int{
    return if(a>b) a else b
}