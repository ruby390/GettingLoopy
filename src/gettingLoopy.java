public class gettingLoopy {
        public static void main(String[] args) {
            // variables
            int cnt = 0;
            int i = 0;
            int j = 0;
            // A loop that counts (i.e. displays the count) up by 1 from 0 to 30
            for(cnt=0; cnt <= 30; cnt++)
            {
                System.out.println(cnt);
            }
            for(cnt = 30; cnt >= 0; cnt--)
            {
                System.out.println(cnt);
            }
            System.out.println();
            // A loop that counts up by 3 from 0 to 18
            for(cnt = 0; cnt <= 18; cnt = cnt + 3)
            {
                System.out.println(cnt);
            }
            System.out.println();
            // A loop that counts down by 2 from 10 to 0
            for(cnt = 10; cnt >= 0; cnt = cnt -2)
            {
                System.out.println(cnt);
            }
            System.out.println();
            /*
            A nested loop that creates this figure (there are no blank lines)
            *
            **
            ***
            ****
            *****
            */
            for (i = 1; i <=5; i++)
            {
                for (j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            /*
             A nested loop that creates this figure (there are no blank lines)
            *****
            ****
            ***
            **
            *
            */
            for (i = 1; i <=5; i++)
            {
                for (j = 1; j <= 6-i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            /*
            A nested loop that creates this figure (there are no blank lines)
            *****
            *****
            *****
            *****
            *****
             */
            for (i = 1; i <=5; i++)
            {
                for (j = 1; j <= 6; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
