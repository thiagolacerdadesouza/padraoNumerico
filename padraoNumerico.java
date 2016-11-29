/*Padrões de Projeto de Ordenação e Piramides
Padrão 1
Entre com um numero de 1 a 9 : 4
   1
  121
 12321
1234321
*/
package com.thiagolacerdadesouza;
 
import java.util.Scanner;
 
public class PadraoNUmerico1 {
 
    public static void main(String[] args) {
        int num, space;
 
        System.out.print("Entre com um numero de 1 a 9 : ");
 
        Scanner reader = new Scanner(System.in);
        try {
            num = reader.nextInt();
 
            space = num - 1;
 
            for (int i = 1; i <= num; i++) {
                for (space = 1; space <= (num - i); space++) {
                    System.out.print(" ");
                }
 
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
 
                for (int k = (i - 1); k >= 1; k--) {
                    System.out.print(k);
                }
 
                System.out.println();
 
            }
        } finally {
            reader.close();
        }
    }
}
/*Padrão 2
1
22
333
4444
55555
*/
package com.thiagolacerdadesouza;

public class PadraoNumerico2 {
 
    public static void main(String[] args) {
        int count = 5;
 
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
 
}
/*Padrão 3
1
12
123
1234
12345
1234
123
12
1
*/

package com.thiagolacerdadesouza;

public class PadraoNumerico3 {
 
    public static void main(String[] args) {
        int n = 5;
 
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
        System.out.println();
    }
}
/*Padrão 4
12345
1234
123
12
1

1
12
123
1234
12345
*/

package com.thiagolacerdadesouza;

public class PadraoNumerico4 {
 
    public static void main(String[] args) {
        int n = 5;
 
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
 
        System.out.println();
    }
}

/*Padrão 5
1
01
101
0101
10101
*/
package com.thiagolacerdadesouza;

public class PadraoNumerico5 {
 
    public static void main(String[] args) {
         int n, p, q;
         
            n = 5;
            for (int i = 1; i <= n; i++)
            {
                if (i % 2 == 0)
                { p = 1; q = 0; }
                else
                { p = 0; q = 1; }
                for (int j = 1; j <= i; j++)
                    if (j % 2 == 0)
                        System.out.print(p);
                    else
                        System.out.print(q);
                System.out.println();
     
            }
    }
}
/*Padrão 6
1
23
456
78910
*/
package com.thiagolacerdadesouza;

public class PadraoNumerico6 {
 
    public static void main(String[] args) {
        int rows, k = 1;
          
        rows = 4;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print(k++);
            System.out.println();
        }  
    }
}

/*Padrão 7

    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
*/
package com.thiagolacerdadesouza;

public class PadraoNumerico7 {
 
    public static void main(String[] args) {
        
        int n= 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}

/*Padrão 8
5
54
543
5432
54321
*/
package com.thiagolacerdadesouza;

public class PadraoNumerico8 {
 
    public static void main(String[] args) {
 
        int i = 5;
        while (i >= 1) {
            int j = 5;
            while (j >= i) {
                System.out.print(j);
                j--;
            }
            i--;
            System.out.println();
        }
    }
}

/*Padrão 9
1****
12***
123**
1234*
12345
*/
package com.thiagolacerdadesouza;

public class PadraoNumerico9 {
 
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; ++j)
                System.out.print(j);
 
            for (k = n - i; k >= 1; k--)
                System.out.print("*");
 
            System.out.println();
        }
 
    }
}

/*Padrão 10

    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 
*/
package com.thiagolacerdadesouza;

public class PadraoNumerico10 {
 
    public static void main(String[] args) {
        int i, j, k;
        
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= i; k++)
                System.out.print(k + " ");
 
            System.out.println();
        }
 
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= 5 - i; k++)
                System.out.print(k + " ");
 
            System.out.println();
        }
 
    }
}


//Codigo feito com base em exercicios do Site http://www.topjavatutorial.com/