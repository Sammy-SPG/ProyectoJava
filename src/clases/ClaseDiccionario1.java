package clases;

public class ClaseDiccionario1 {

     private final String[] palabras = {
         "plano cartesiano", "elipse","focos","centro","semieje mayor","semieje menor","radios vectores","vértices","cuadrante","punto medio","cónicas","circunferencia","parábola","hipérbola","circulo","diametro","radio","tangente","secante","ángulo","ángulo adyacente","segmentos dirigidos","inclinación","pendiente",
        "abscisa al origen","ordenada al origen","bisectriz"," mediatriz","circuncentro","ortocentro","asíntotas"
     };
    private final String[] significados = { 
        "Se conoce como plano cartesiano, coordenadas cartesianas o sistema a\n"
            + "dos rectas numéricas perpendiculares, una horizontal y otra\n"
            + "vertical, que se cortan en un punto llamado origen o punto cero.",////////
         "1.La elipse es el lugar geométrico de los puntos del plano cuya suma\n"
            + "de las distancias a los dos focos (puntos interiores fijos F1 y F2)\n"
            + " es constante. Es decir, para todo punto a de la elipse \n"
            + "la suma de las distancias d1 y d2 es constante. 2.Es la línea\n"
            + "que se obtiene al cortar un cono recto con un plano oblicuo",//////////
         "Son los puntos fijos F1 y F2 que generan la elipse. La suma de las\n"
            + "dos distancias de cualquier punto de la elipse a los dos focos\n"
            + "(d1 y d2) es constante.",/////////////////
         "Es el punto medio de los dos focos (O).",///////////
         "Longitud del segmento OI o OK (a). La longitud es mayor\n"
            + "(o igual en el caso de la circunferencia) a la del semieje menor.",////////////
         "Longitud del segmento OJ o OL (b). Ambos semiejes son los\n"
            + "dos ejes de simetría de la elipse.",//////////////
         "Los radios vectores de cualquier punto de la elipse (P=(x,y))\n"
            + "son los dos segmentos que lo unen con los dos focos.",////////////
         "Son los puntos resultantes de la intersección de la elipse con\n"
            + "la recta que pasa por los focos, F1F2, y su perpendicular que\n"
            + "pasa por el centro. Es decir, son los puntos I, J, K y L",////////////
         "Se les llama cuadrantes a cada una de las cuatro regiones en\n"
            + "que divide al plano, los ejes coordenados, se enumeran en\n"
            + "sentido contrario a las manecillas del reloj. ",/////////////
         "Punto  localizado  en  la  mitad  de  un  segmento,\n"
            + "sus  coordenadas  se  calculan  con  las siguientes formulas\n"
            + "X  = ( X1 +  X2 ) / 2           Y  =  ( Y1 +  Y2) / 2 ",////////////////
         "Las cónicas son curvas que surgen al cortar un cono con planos de\n"
            + "distinta inclinación. Es importante tener en cuenta que son\n"
            + "líneas curvas y no superficies.",////////////
         "Es la línea que se obtiene al cortar un cono recto con\n"
            + "un plano paralelo a la base.",////////
         " 1.Es la línea que se obtiene al cortar un cono recto con un\n"
            + "plano paralelo a una generatriz. 2.Es el conjunto de puntos\n"
            + "en el plano que equidistan de una recta fija y un punto fijo\n"
            + "que no está en ella. La recta fija se llama directriz \n"
            + "y el punto fijo se llama foco. ",/////////////////////////
         "Es la línea que se observa al cortar un cono recto\n"
            + "con  un  plano perpendicular a la base del mismo.",///////////
         "Se llama círculo al conjunto de puntos de una circunferencia, más\n"
            + " los puntos interiores a la misma.",////////////
         "Recta que une dos puntos de la circunferencia pasando\n"
            + "por su centro.",///////////////
         "Recta que une el centro de la circunferencia con cualquier\n"
            + "punto de ésta.",//////////////
         "Recta que toca a la circunferencia en un punto.",/////////////
         "Recta que corta a la circunferencia en dos puntos.",//////////
         "Espacio comprendido entre la intersección de dos líneas que\n"
            + "parten de un mismo punto o vértice, y que es medido en grados.",/////////////
         "Dos ángulos serán adyacentes si están consecutivos con\n"
            + "respecto a una recta, y serán opuestos por el vértice\n"
            + "si los lados son prolongaciones de los lados de otro ángulo.",///////////////////
         "Un segmento dirigido es aquel que está determinado\n"
            + "por dos puntos en la recta numérica ejemplo el\n"
            + "segmento que va del punto 2 al punto 6",/////////////////////
         "Una recta no paralela al eje x forma un ángulo de\n"
            + "comprendido entre 0° y 180°. Al ángulo formado\n"
            + "se le llama ángulo de inclinación.",////////////////
         "Se denomina pendiente o coeficiente angular de una recta a la\n"
            + "tangente de su ángulo",////////////
         "Es el punto donde la recta corta al eje x, de la forma (a,0)",//////////
         "Es el punto donde la recta corta al eje y, de la forma (0,b)\n"
            + "Si uno de los puntos es (0,b), y retomamos la\n"
            + "Ecuación punto pendiente",//////////////////
         "La bisectriz de un triángulo es el segmento que, dividiendo\n"
            + "uno de sus tres ángulos en dos partes iguales, termina\n"
            + "en el correspondiente lado opuesto.",//////////
         "La mediatriz de un segmento es la recta que pasa por el\n"
            + "punto medio del segmento y es perpendicular al él.",///////////
         "1.El circuncentro es el punto de corte de las tres mediatrices.\n"
            + "2.El circuncentro es el centro de una circunferencia.",////////////
         "El ortocentro es el punto de corte de las tres alturas y\n"
            + "se expresa con la letra H.",//////
         "Las asíntotas son rectas a las cuales la función \n"
            + "se va acercando indefinidamente."
         
    
    };
    private String Auxsig;
    private String PalabraClave;
    boolean bant = false;
    private int i = 0;
    
    public int getI(){
        return i;
    }
    
    public String getAuxsig(){
        return Auxsig;
    }
    
    public void setPalabraClave(String PalabraClave){
        this.PalabraClave = PalabraClave;
    }
    
    public String[] getPalabras(){
        return palabras;
    }
    
    
    public void buscar() {
        int j = 0;
        while(j<palabras.length && bant == false){
            if(palabras[j].equals(PalabraClave)){
                Auxsig = significados[j];
                bant = true;
            }
            j++;
        }
        i = j;
        bant = false;
        System.out.println(j);
    }
    
    
}
