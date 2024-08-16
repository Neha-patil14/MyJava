import java.util.Scanner;

class Matrix1
{
        int i,j,sum,sub;
        int Mat1[][]=new int[2][2];
        int Mat2[][]=new int[2][2];
        int multi[][]=new int[2][2];
        Scanner sc = new Scanner(System.in);
        void getData()
        {
        System.out.println("Enter the elements for fisrt matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                Mat1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the elements for second matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                Mat2[i][j]=sc.nextInt();
            }
        }

        System.out.println("First matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(Mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(Mat2[i][j] + " ");
            }
            System.out.println();
        }
        }
        void Add()
        {
        System.out.println("Addition of two Matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                sum= Mat1[i][j]+Mat2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        }
        void Sub()
        {
        System.out.println("Subtraction of two Matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                sub= Mat1[i][j]-Mat2[i][j];
                System.out.print(sub + " ");
            }
            System.out.println();
        }
        }
        void Multi()
        {
            System.out.println("Multiplication of two Matrix is: ");
            for(i=0; i<2; i++)
            {
                for(j=0; j<2; j++)
                {
                    multi[i][j] = 0;

                    for(int k=0; k<2; k++)
                        multi[i][j] += Mat1[i][k] * Mat2[k][j];
                }
            }

            for(i=0; i<2; i++)
            {
                for(j=0; j<2; j++)
                {
                    System.out.print(multi[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

class Matrix
{
    public static void main(String[] args)
    {
        Matrix1 m=new Matrix1();
        m.getData();
        m.Add();
        m.Sub();
        m.Multi();
    }
}