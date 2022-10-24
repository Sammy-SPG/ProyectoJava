package clases;

import java.util.StringTokenizer;

public class Respuestas1 {
    String[] respuestas = {
        "c) (19,20)","b)Rectas","c) Abcisas(x) y Ordenadas","C) R, 0","c)P= (5,53.13°)","a) PM= b*h/2*5",
        "a) (2,1)"," c)d(A,B)= √ (x2-x1)² + (y2-y1)²","a) (6,32)"," c(6,7)",
        "a) Es un numero el cual indica que tan inclinada esta una recta",
        " b)Pendiente Mayor y menor","a) Pendiente Cero e Infinita",
        "a) y=-2x+12"," c) y=3x+5"," c)3/5x+4/5y+9/5=0",
        "a) 4/5x+3/5y-10/5=0","b)2 Criterios","c)m2","b)sera restado restado con 180°",
        "a)Familia de Rectas","a)Todas las rectas se cortaran en un mismo punto",
        "b)Cambia la posición horizontal de las rectas",
        "a)De la recta de la forma perpendicular","c)En el signo de B",
        "a)Que el punto se encuentra por abajo de la recta","c)Incentro","b)Ortocentro",
        "a)Circucentro","a)Centro","b)Que tiene centro en 0, 0","b)El centro","c)Directriz",
        "a)Para hayar la distancia del vertice al foco","b)Foco","a)Focos",
        "b)La distancia de foco a foco","b)Que tan redonda o aplastada esta"
        
    };
    String[] radioR = {
        "a) x-y+2*5:b)(r,p):c) (19,20)",
        "a) Circunferencias:b)Rectas:c) Vertices",
        "a) Mayor(x) y menor(y):b) Equilatera(x) y Congruente(y):c) Abcisas(x) y Ordenadas",
        "A) x,y:B) A Y:C) R, 0",
        "a) r=√25:b) XY=(2.5,68):c)P= (5,53.13°)",
        "a) PM= b*h/2*5:b)PM= r*pi*2:c)PM= ((2/(x1+x2),2/(y1+y2))",
        "a) (2,1):b) (-2,1):c) (5,1)",
        "a) b=x1*y-2: b)d=x1,y2-y1: c)d(A,B)= √ (x2-x1)² + (y2-y1)²",
        "a) (6,32): b)(-6,32): c)(6,-32)",
        "a) (-6,-7): b)(6,-7): c(6,7)",
        "a) Es un numero el cual indica que tan inclinada esta una recta: b) Un numero con el cual se calcula la formula general de una coordenada: c)Un numero el cual te dice la circunferencia de una recta",
        "a) Pendiente Ordenada y absisa: b)Pendiente Mayor y menor: c)Pendiente x,y",
        "a) Pendiente Cero e Infinita: B) Pendiente inclinada opuesta y positiva: c) Pendiente hacia arriba y hacia abajo",
        "a) y=-2x+12: b) y=4x+16: c) y=-4x-16",
        "a) y=-3x-5: b) y=6x+10: c) y=3x+5",
        "a) x²+y²+x+y+N=0: b)(x,y) + (-y,-x): c)3/5x+4/5y+9/5=0",
        "a) 4/5x+3/5y-10/5=0: b)1x+ 4/5y +3/5=0: c)-4/5x+8=0",
        "a)1 Criterio:b)2 Criterios:c)3 Criterios:",
        "a)Ninguna, miden lo mismo:b)m1:c)m2",
        "a)El angulo sera negativo:b)sera restado restado con 180°:c)Ninguna de las anteriores",
        "a)Familia de Rectas:b)Angulo Interno:c)Pendiente",
        "a)Todas las rectas se cortaran en un mismo punto:b)Cambia la posición horizontal de las rectas:c)No pasa nada",
        "a)No pasa nada:b)Cambia la posición horizontal de las rectas:c)Todas las rectas se cortaran en un mismo punto",
        "a)De la recta de la forma perpendicular:b)De los puntos A, B y C:c)Del radical",
        "a)En el signo de A:b)En el signo de C:c)En el signo de B",
        "a)Que el punto se encuentra por abajo de la recta:b)Que la distancia es negativa:c)Que se hizo mal la ecuación",
        "a)Ortocentro:b)Baricentro:c)Incentro","a)Baricentro:b)Ortocentro:c)Circucentro",
        "a)Circucentro:b)Incentro:c)Ortocentro","a)Centro:b)Radio:c)Perimetro",
        "a)Que tiene centro en Y:b)Que tiene centro en 0, 0:c)Que tiene centro en X",
        "a)El radio:b)El centro:c)Ninguno de los anteriores",
        "a)Mediatriz:b)Bisectriz:c)Directriz",
        "a)Para hayar la distancia del vertice al foco:b)Para hayar la distancia del vertice a la directriz:c)Para hayar la distancia de la directriz al foco",
        "a)Vertice:b)Foco:c)L y R","a)Focos:b)Vertices:c)Lados",
        "a)La distancia de vertice a vertice:b)La distancia de foco a foco:c)El eje mayor",
        "a)Su radio:b)Que tan redonda o aplastada esta:c)Ninguna de las anteriores"
    };

    public String getRespuesta(int posicion) {
        return respuestas[posicion];
    }

    public String[] separar(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);

        String[] a = new String[17];
        int i = 0;

        while (token.hasMoreTokens()) {
            a[i] = token.nextToken();
            i++;
        }
        return a;
    }

    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ":");
        return s2;
    }
}
