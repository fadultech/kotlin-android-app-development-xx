fun main() {
    println("Olá, Mundo Kotlin!!")
    /**
     * declaração de variáveis
     */
    var nome: String = "Gabriel"
    // poderia ficar com o tipo inferido
    var ender = "Rua nova, 25"
    nome = "Gabriel da Silva"
    println(nome)

    /**
     * tipos de variaveis:
    Type    Bytes
    Double   8 - para numeros decimais
    Float    4 - para numeros decimais
    Long     8 - para numeros inteiros
    Int      4 - para numeros inteiros
    Short    2 - para numeros inteiros
    Byte     1 - para numeros inteiros
    Boolean  1 bit (0/1)?
    String   depende do tamanho da frase
    Char     1

    Se quiser trabalhar com um tipo de dado específico
    deve sempre definir o tipo e
    não deixar o Kotlin inferir
    senão um tipo Byte vai inferir como Int
     */

    var b: Boolean = true
    var s: String = "depende do tamanho da frase"
    var c: Char = 'a'

    var double: Double = 10.0
    var float: Float = 10.0F
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10
    val altura = 10/3F
    println("\n $altura\n")

    // mostrando os valores máximos de cada tipo
    println("\nDouble MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")

    /**
     * Unsigned
    tipos de dados Unsigned (sem sinal)
    eles perdem a parte negativa
    usado para aumentar o máximo valor positivo
    quando não vão ser usados valores negativos
     ** válidos somente para inteiros **
     */
    println("\nULong MAX ${ULong.MAX_VALUE} - MIN ${ULong.MIN_VALUE}")
    println("UInt MAX ${UInt.MAX_VALUE} - MIN ${UInt.MIN_VALUE}")
    println("UShort MAX ${UShort.MAX_VALUE} - MIN ${UShort.MIN_VALUE}")
    println("UByte MAX ${UByte.MAX_VALUE} - MIN ${UByte.MIN_VALUE}\n")

    var ulong: ULong = 10U
    var uint: UInt = 10U
    var ushort: UShort = 10U
    var ubyte: UByte = 10U
    println(uint)

    /**
     * variáveis Mutáveis e Imutáveis
     * */
    // var permite que a variável seja alterada
    // Mutável
    var hferro = "Tony"
    hferro = "Stark"
    // val não permite que a variável seja alterada
    // Imutável
    val haranha = "Peter"
    // haranha = "Parker"  // ERRO: Val cannot be reassigned
    // PROCURAR USAR SEMPRE VAL SE A VARIÁVEL NÃO FOR MODIFICADA

    /**
     * formatação de Strings
     */
    nome = "Tony"
    var sobreNome = "Stark"

    // Concatenação
    println("\nOlá, " + nome + " " + sobreNome + "!")

    // Interpolação - somente com as variáveis
    // OPCIONAL incluir a variável entre { }
    println("\nOlá, $nome ${sobreNome}!")
    // Interpolação - com as variáveis e seus atributos
    // DEVE incluir a variável e seus atributos entre { }
    println("\nDouble MAX ${Double.MAX_VALUE}")

    // tamanho da String
    println(nome.length)

    // se a String for muito grande
    // pode concatenar em mais de uma linha
    val str = "kjlk j kljçl" +
            "hkhlhlkjkjjklh lkçkl" +
            "çjljlkjjçlj" +
            " jkhkjh lkjkj lkkj"
    println("\n $str")

    /**
     * operadores aritméticos
     */
    // +, -, *, /, %
    var idade = 30
    idade = idade + 3  // idade += 3  // soma 3 e move o resultado para idade
    idade = idade - 3  // idade -= 3  // subtrai 3 e move o resultado para idade
    idade = idade * 3  // idade *= 3  // multiplica por 3 e move o resultado para idade
    idade = idade / 3  // idade /= 3  // divide por 3 e move o resultado para idade
    idade = idade % 3  // divide por 3 e move o RESTO DA DIVISÃO para idade

    idade =+ 3  // move 3 para idade e soma com 0
    println("\n $idade")
    idade =- 3  // move 3 para idade e subtrai de 0
    //  idade =* 3  ERRO: não aceita
    //  idade =/ 3  ERRO: não aceita
    println("\n $idade\n")

    idade = 10
    println(idade++)  // o programa usa a variável e depois incrementa
    println("$idade\n")

    idade = 10
    println(++idade)  // o programa incrementa a variável e depois usa
    println("$idade")

    //  idade**  ERRO: não aceita
    //  idade//  ERRO: não aceita
    //  **idade  ERRO: não aceita
    //  //idade  ERRO: não aceita

}