package clases;

public class Información {

    private final String tema_1 = "Plano cartesiano \n"
            + "\n"
            + " El plano cartesiano esta formado por dos rectas numericas, una horizontal \n"
            + "y la otra verticalque se cortan en un punto. la recta horizontal es llamada\n"
            + "eje de las abcisas o de las equis(x), y la vertical, eje de las ordenadas o \n"
            + "de las yes(y); el punto donde se cortan (en medio) recibe el nombre de origen\n"
            + "el plano cartesino sirve para identificar puntos o coordenadas \n"
            + "correspondientes en el eje de las (x) hacia la derecha o hacia la izquierda\n"
            + "y luego las unidades del eje de las (y) hacia riba o hacia abajo segun\n"
            + "sea positivas o negativas. ";

    private final String tema_2 = "Coordenadas polares \nLas coordenadas polares son un sistema\n "
            + "de coordenadas\n"
            + "bidimensional en el que cada punto del plano se determina \n"
            + "por la distancia reducida del punto, el origen de coordenadas y\n"
            + "el ángulo formado por la alineación con el eje de coordenadas.\n"
            + "Para conseguir los datos de distancia reducida usted puede usar\n"
            + "alguno de los métodos de apreciación de distancias.\n"
            + "Para averiguar el ángulo puede usar una brújula\n"
            + "Por ejemplo, si usted interpreta que desde su posición a una \n"
            + "ubicación concreta hay 300 metros de distancia y con una brújula\n"
            + "calcula que el rumbo hacia esa ubicación es de 20 grados, las \n"
            + "coordenadas polares son esos mismos datos: 300m y 20º.\n\n"
            + "Transformación de coordenadas polares a coordenadas rectangulares\n"
            + "Si se dispone de las coordenadas polares, es decir, el rumbo y \n"
            + "la distancia de un punto, solo hay que seguir la siguiente fórmula:\n"
            + "Si se dispone de las coordenadas polares, es decir, el rumbo y la\n"
            + "distancia de un punto, solo hay que seguir la siguiente fórmula:\n"
            + "X= D senR\n"
            + "Y= D cosR\n"
            + "Siendo D la distancia reducida y R el rumbo.\n"
            + "Ejemplo:\n"
            + "Usted se encuentra en la siguiente posición: X=74200, Y=28500.\n"
            + "Desde ahí saca coordenadas\n"
            + "polares de un punto: 300m y 20º. Ahora solo tiene que sustituir los\n"
            + "elementos de la fórmula:\n"
            + "X= 300 x sen20           X=102m\n"
            + "Y= 300 x cos20           Y=281m\n"
            + "El resultado tanto en X como en Y se debe sumar a las coordenadas\n"
            + "de origen, en este caso \n"
            + "las de nuestra posición:\n"
            + "X= 74200 + 102          X= 74302\n"
            + "\n"
            + "Y= 28500 + 281          Y= 28781\n"
            + "De esta manera, ahora usted conoce las coordenadas  del punto en\n"
            + "cuestión: X= 74302, Y= 28781.\n"
            + "Antes de salir al campo es recomendable que usted ponga en práctica\n"
            + "este método para adquirir habilidad y obtener buenos resultados.\n"
            + "El sistema de coordenadas rectangulares (o plano cartesiano) \n"
            + "es un objeto matemático  formado por dos rectas perpendiculares \n"
            + "trazadas sobre un plano. Las rectas son llamadas \n"
            + "\"Ejes\", la recta horizontal es el eje \"x\" y la recta\n"
            + "vertical es el eje \"y\";\n"
            + "Cada uno de los ejes tiene un lado positivo y uno negativo,\n"
            + "el punto donde cruzan dichas rectas es el (0,0) llamado origen.\n"
            + "\n"
            + "\n"
            + "Eje x:\n"
            + "Este eje se divide en dos partes. Del origen a la derecha es\n"
            + "positivo y del origen a la izquierda negativo.\n"
            + " \n"
            + "Eje Y:\n"
            + "Del origen hacia arriba es positivo y del origen hacia abajo\n"
            + "es negativo.\n"
            + "además estas rectas dividen el plano en 4 partes iguales, \n"
            + "llamadas \"cuadrantes\".";

   private final String tema_3 = "Punto medio de un segmento\n"
            + "Es el punto que se encuentra a la misma distancia de otros dos\n"
            + "puntos cualquiera o extremos de un segmento.\n"
            + "Si es un segmento, el punto medio es el que lo divide en dos partes iguales.\n"
            + "En ese caso, el punto medio es único y equidista de los extremos\n"
            + "del segmento."
            + "Por cumplir esta última condición, pertenece a la mediatriz del segmento.\n"
            + "Las coordenadas del punto medio (M) de un segmento (s) delimitado\n"
            + " por los puntos A y B son iguales a la semisuma de las coordenadas\n"
            + "de sus extremos."
            + "Si A(x1, y1) y B(x2, y2):\n"
            + "En los problemas geométricas son frecuentes los casos cuando es\n"
            + "necesario hallar el punto medio de un segmento dado expresado con\n "
            + "dos puntos de sus extremos, por ejemplo,\n"
            + "en los problemas sobre la mediana, la línea media, etc.\n"
            + "Cada una de las coordenadas del punto medio de un segmento es\n"
            + "igual a la semisuma de las coordenadas respectivas de sus extremos.\n"
            + "Xc= ((Xa+Xb)/2)  Yc= ((Ya+Yb)/2)\n"
            + "Fórmulas para hallar las coordenadas del punto medio de un segmento\n"
            + "con extremos A(xa, ya, za) y B(xb, yb, zb) en espacio:\n"
            + "Xc= ((Xa+Xb)/2)  Yc= ((Ya+Yb)/2)  Zc= ((Za+Zb)/2)\n";

    private final String tema_4 = "Distancia entre dos puntos\n"
            + "\n"
            + "La Distancia entre dos puntos se define como la medida de un\n"
            + "segmento que va desde un punto A, a un punto B.\n"
            + "Esta dichosa distancia se mide por medio de una formula:\n"
            + "Donde X1 y X2 es igual a el primer y segundo valor numerico de\n"
            + "X en el punto A y B, de igual manera con Y1 y Y2. En el que se\n"
            + "restan las X, y se eleva al cuadrado, de la misma manera con las\n"
            + "Y, y una vez obtenidas las restas de X1 y X2, Y1 y Y2, los\n"
            + "resultados les aplicamos una reiz cuadrada y listo, obtuvimos\n"
            + "la distancia entre el punto A y el punto B. ";
    private final String tema_5 = " pendiente\n"
            + "\n"
            + "La pendiente de una recta describe qué tan pronunciada es, y está\n"
            + "dada por el cambio en los valores de (y) dividido entre el cambio\n"
            + "en los valores de (x).\n"
            + "La pendiente de una recta es un importante concepto geométrico \n"
            + "el cual podemos interpretar como una medida de la inclinación de\n"
            + "una recta cuando la ubicamos en un par de ejes coordenados (x – y).\n"
            + "\n"
            + "la pendiente de la recta es la distancia entre las yes (y)\n"
            + "dividido entre la distancia de las equis(x)  formula: \n"
            + "m = Y1 - Y2/ X1 - X2\n"
            + "\n"
            + "donde (Y1) corresponde al primer punto (A) y (Y2) al segundo punto(B)\n"
            + "asi mismo con las equis (X1, X2).";
    private final String tema_6 = "ECUACIÓN DE LA RECTA\n"
            + "La recta se puede definir como el conjunto infinito \n"
            + "de puntos alineados en una sola dirección. Observada \n"
            + "en un plano, una recta puede ser horizontal, vertical o diagonal.\n"
            + "La línea de la derecha podemos verla, pero a partir \n"
            + "de los datos que nos entrega la misma línea  \n"
            + "(par de coordenadas para A y par de coordenadas para \n"
            + "B en el plano cartesiano)es que podemos encontrar \n"
            + "una expresión algebraica (una función) que determine a esa misma recta.\n"
            + "\n"
            + "El nombre que recibe la expresión algebraica (función) \n"
            + "que determine a una recta dada se denomina Ecuación de la Recta.\n"
            + "\n"
            + "Esta ecuación de la recta varía su formulación de \n"
            + "acuerdo con los datos que se conozcan de la  línea \n"
            + "recta que se quiere representar algebraicamente. \n"
            + "Por eso hay varias formas de representar la ecuación de la recta.\n"
            + "\n"
            + "Ecuación general de la recta\n"
            + "Esta es una de las formas de representar la ecuación de la recta.\n"
            + "De acuerdo a uno de los postulados de la Geometría Euclidiana, \n"
            + "para determinar una línea recta sólo es necesario conocer dos \n"
            + "puntos (A y B) (en un plano cartesiano), con abscisas (x) y ordenadas (y).\n"
            + "Ahora bien, conocidos esos dos puntos, todas las rectas del plano, \n"
            + "sin excepción, quedan incluidas en la ecuación\n"
            + "\n"
            + "Ax + By + C = 0";
    private final String tema_7 = "Forma normal de la recta\n"
            + "La forma normal de la ecuación involucra la distancia de una recta al\n"
            + "origen, que por definición, es perpendicular a la recta.\n"
            + "La ecuacion de la recta en su forma normal es:\n"
            + "((Ax+By+C)/√A²+B²)=((A)/√A²+B²)X + ((B)/√A²+B²)Y + ((C)/√A²+B²)=0";

    private final String tema_8 = "Angulos entre rectas\n"
            + "\n"
            + "El angulo entre 2 rectas que se cortan y forman angulos entre si,\n"
            + "es una relación en la que nostros podemos determinar esos angulos\n"
            + "por medio de ecuaciones. Estas ecuaciones pueden ser: y = mx + b,\n"
            + "o Ax + By + c = 0, en dado caso en el que contemos con la ecuacion\n"
            + "punto pendiente (y=mx+b), para encontrar los angulos entre las rectas\n"
            + "nuestra primera pendiente sera igual a m (por ejemplo, y=5x+10,donde\n"
            + "m = 5, y es igual a una de las 2 pendientes requeridas para obtener\n"
            + "los angulos), y la segunda pendiente sera igual a la m de la segunda\n"
            + "ecuación.\n"
            + "Pero al contar con una ecuación general, para encontrar m necesitamos\n"
            + "los valores de A y B, que los vamos a divir mediante la siguiente formula:\n"
            + "m= -A/B, (por ejemplo 2x-y-5=0, A=2, B=-1, y si sustituimos m= -2/-1= 3)\n"
            + "y de esa manera obtenemos la pendiente de una de las resctas, por lo que\n"
            + "hacemos lo mismo con la siguiente ecuación.\n"
            + "Una vez obtenidas las 2 pendientes, procedemos a hacer la ecuación para\n"
            + "obtener el angulo: Angulo= ArcTan(o tan-1)(m1-m2/1+(m1*m2)). Nota: si el\n"
            + "angulo es negativo, quiere decir que el angulo va desde la recta 1, a la\n"
            + "recta 2, con sentido de las manecillas del reloj, y si es positivo, va\n"
            + "desde la recta 2, a la recta 1, en el sentido contrario de las manecillas\n"
            + "del reloj. ";
    private final String tema_9 = " familia entre rectas\n"
            + "\n"
            + "Una familia de rectas es un conjunto de rectas que tienen algo en\n"
            + "común entre sí. Las líneas rectas pueden pertenecer a dos tipos de familia:\n"
            + "donde la pendiente es la misma donde la pendiente es la misma y\n"
            + "donde el intercepto es el mismo.\n"
            + "Recuerda que las rectas con la misma pendiente son paralelas\n";
    private final String tema_10 = " ";
    private final String tema_11 = "Rectas y puntos notables de un triangulo\n"
            + "ectas y puntos notables de un triángulo. Un triángulo, en geometría,\n "
            + "es un polígono determinado por tres rectas que se cortan dos a dos\n"
            + "en tres puntos (que no se encuentran alineados).\n"
            + "Los puntos de intersección de las rectas son los vértices y los \n"
            + "segmentos de recta determinados son los lados del triángulo.\n"
            + "Dos lados contiguos forman uno de los ángulos\n"
            + "interiores del triángulo. En los triángulos se pueden denotar un \n"
            + "grupo de rectas y puntos muy importantes.\n"
            + "Entre las rectas notables más conocidas de un triángulo se pueden nombrar\n"
            + "las mediatrices, las medianas, las alturas y las bisectrices; cada una de\n"
            + "estas rectas notables determinan los puntos notables: circuncentro \n"
            + "baricentro, ortocentro y el incentro, respectivamente.\n"
            + "Mediatriz: Conjunto de puntos del plano que equidistan de los puntos\n"
            + "extremos de un segmento.\n"
            + "Como consecuencia la mediatriz biseca perpendicularmente al segmento.\n"
            + "En un triángulo \n"
            + "las tres mediatrices de sus lados concurren en un punto que equidista de\n"
            + "los vértices del triángulo.\n"
            + "Mediana: La mediana es el segmento de recta que se traza desde un vértice\n"
            + "de un triángulo al punto medio de su lado opuesto.\n"
            + "Bisectriz de un ángulo: Es el conjunto de puntos del plano donde está\n"
            + "contenido el ángulo que equidista de los lados del ángulo.\n"
            + "Como consecuencia la bisectriz de un ángulo lo divide en dos ángulos de\n"
            + "igual amplitud.\n"
            + "Altura: Se llama altura de un triángulo al segmento de perpendicular\n"
            + "trazada por un vértice del triángulo y comprendido entre ese vértice\n"
            + "y su lado opuesto. \n"
            + "El Incentro :es el punto en el que se intersecan las tres bisectrices\n"
            + "de los ángulos internos del triángulo, y es el centro de la circunferencia\n"
            + "inscrita en el\n"
            + "triángulo y que equidista de sus tres lados, siendo tangente a dichos lados.\n"
            + "Ortocentro: Se denomina ortocentro (símbolo H) al punto donde se cortan las\n"
            + "tres alturas de un triángulo. Este no es un hecho trivial, pues tres rectas\n"
            + "cualquiera,\n"
            + "tomadas a pares, podrían intersecarse en tres puntos diferentes, pero en el\n"
            + "caso de las alturas de un triángulo dado, puede demostrarse que se\n"
            + "intersecan en un solo punto, es decir, en el ortocentro.\n"
            + "El baricentro es el punto de corte de las tres medianas.\n";
    private final String tema_12 = "Circunferencia\n"
            + "\n"
            + "Se define como el lugar geométrico de los puntos del plano\n"
            + "que equidistan de un punto fijo llamado centro.\n"
            + "Podemos definir 2 tipos de circunferencias, con centro en el\n"
            + "origen (quiere decir que tiene centro en las coordenadas 0,0)\n"
            + "y con centro fuera del origen (con centro diferente de 0,0).\n"
            + "Podemos genera una circunferencia con 2 de sus elementos,\n"
            + "el centro (C= h, k), y radio (R= x, y).";
    private final String tema_13 = " ";
    private final String tema_14 = "Elipse\n"
            + "\n"
            + "La elipse se define como el lugar geométrico de los puntos\n"
            + "del plano tales que la suma de sus distancias\n"
            + "hacia dos puntos fijos llamados focos permanece\n"
            + "constante.\n"
            + "Podemos generar 2 tipos de elipses a partir de sus elementos,\n"
            + "pueden ser el eje mayor, una distancia entre el vertice y un\n"
            + "foco al centro, la distancia focal, etc, pero siempre tendran\n"
            + "una orientación, ya sea vertical, que tiene una ecuación donde\n"
            + "el menor valor al cuadrado (b) se ubica sobre x, y en la\n"
            + "horizontal, donde le mayor valor al cuadrado (a) se ubica sobre\n"
            + "x.";

    public String Totema_1() {
        return tema_1;
    }

    public String Totema_2() {
        return tema_2;
    }

    public String Totema_3() {
        return tema_3;
    }

    public String Totema_4() {
        return tema_4;
    }

    public String Totema_5() {
        return tema_5;
    }

    public String Totema_6() {
        return tema_6;
    }

    public String Totema_7() {
        return tema_7;
    }

    public String Totema_8() {
        return tema_8;
    }

    public String Totema_9() {
        return tema_9;
    }

    public String Totema_10() {
        return tema_10;
    }

    public String Totema_11() {
        return tema_11;
    }

    public String Totema_12() {
        return tema_12;
    }

    public String Totema_13() {
        return tema_13;
    }

    public String Totema_14() {
        return tema_14;
    }

}
