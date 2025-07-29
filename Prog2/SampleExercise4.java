
package Prog2;
import java.util.*;
public class SampleExercise4 
{
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        
        int A=0, B=0 , C=0, D=0, E=0, F=0, G=0, H=0, I=0, J=0, K=0, L=0, M=0, N=0,
                O=0, P=0, Q=0, R=0, S=0, T=0, U=0, V=0, W=0, X=0, Y=0, Z=0;
        
        System.out.println("- LETTER COUNTER -");
        System.out.print("Enter Sentence: ");
        String inputSentence=in.nextLine().toLowerCase();
        System.out.println("---------------------------------------------");
        
        A=letterA(inputSentence,A);
        B=letterB(inputSentence,B);
        C=letterC(inputSentence,C);
        D=letterD(inputSentence,D);
        E=letterE(inputSentence,E);
        F=letterF(inputSentence,F);
        G=letterG(inputSentence,G);
        
        H=letterH(inputSentence,H);
        I=letterI(inputSentence,I);
        J=letterJ(inputSentence,J);
        K=letterK(inputSentence,K);
        L=letterL(inputSentence,L);
        M=letterM(inputSentence,M);
        N=letterN(inputSentence,N);
        
        O=letterO(inputSentence,O);
        P=letterP(inputSentence,P);
        Q=letterQ(inputSentence,Q);
        R=letterR(inputSentence,R);
        S=letterS(inputSentence,S);
        T=letterT(inputSentence,T);
        U=letterU(inputSentence,U);
        
        V=letterV(inputSentence,V);
        W=letterW(inputSentence,W);
        X=letterX(inputSentence,X);
        Y=letterY(inputSentence,Y);
        Z=letterZ(inputSentence,Z);
        
        
        if(A>0)
        System.out.println("a: " + A);
        
        if(B>0)
        System.out.println("b: " + B);

        if(C>0)
        System.out.println("c: " + C);

        if(D>0)
        System.out.println("d: " + D);

        if(E>0)
        System.out.println("e: " + E);

        if(F>0)
        System.out.println("f: " + F);

        if(G>0)
        System.out.println("g: " + G);

        if(H>0)
        System.out.println("h: " + H);

        if(I>0)
        System.out.println("i: " + I);

        if(J>0)
        System.out.println("j: " + J);

        if(K>0)
        System.out.println("k: " + K);

        if(L>0)
        System.out.println("l: " + L);

        if(M>0)
        System.out.println("m: " + M);

        if(N>0)
        System.out.println("n: " + N);

        if(O>0)
        System.out.println("o: " + O);

        if(P>0)
        System.out.println("p: " + P);

        if(Q>0)
        System.out.println("q: " + Q);

        if(R>0)
        System.out.println("r: " + R);

        if(S>0)
        System.out.println("s: " + S);

        if(T>0)
        System.out.println("t: " + T);

        if(U>0)
        System.out.println("u: " + U);

        if(V>0)
        System.out.println("v: " + V);

        if(W>0)
        System.out.println("w: " + W);

        if(X>0)
        System.out.println("x: " + X);

        if(Y>0)
        System.out.println("y: " + Y);

        if(Z>0)
        System.out.println("Z: " + Z);
        
    } // end of main
    
    public static int letterA( String inputSentence, int A)
    {
     int a=-1;
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
           a=inputSentence.indexOf("a", a+1);
           int ctr1=a;
           if(ctr1>-1)
           {  
               A++;
               ctr1=-1;
           }
           
           else{
               break;
           }
        }
        
     return A;
    }
    
    public static int letterB( String inputSentence, int B)
    {
     int b=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         b=inputSentence.indexOf("b",b+1);
           
          int ctr1=b;
           if(ctr1>-1)
           {  
               B++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return B;
    }
    
    public static int letterC( String inputSentence, int C)
    {
     int c=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         c=inputSentence.indexOf("c",c+1);
           
          int ctr1=c;
           if(ctr1>-1)
           {  
               C++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return C;
    }
    
    public static int letterD( String inputSentence, int D)
    {
     int d=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         d=inputSentence.indexOf("d",d+1);
           
          int ctr1=d;
           if(ctr1>-1)
           {  
               D++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return D;
    }
    
     public static int letterE( String inputSentence, int E)
    {
     int e=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         e=inputSentence.indexOf("e",e+1);
           
          int ctr1=e;
           if(ctr1>-1)
           {  
               E++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return E;
    }
     
      public static int letterF( String inputSentence, int F)
    {
     int f=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         f=inputSentence.indexOf("f",f+1);
           
          int ctr1=f;
           if(ctr1>-1)
           {  
               F++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return F;
    }
    
      public static int letterG( String inputSentence, int G)
    {
     int g=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         g=inputSentence.indexOf("g",g+1);
           
          int ctr1=g;
           if(ctr1>-1)
           {  
               G++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return G;
    }
      
      public static int letterH( String inputSentence, int H)
    {
     int h=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         h=inputSentence.indexOf("h",h+1);
           
          int ctr1=h;
           if(ctr1>-1)
           {  
               H++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return H;
    }
      
         public static int letterI( String inputSentence, int I)
    {
     int i=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         i=inputSentence.indexOf("i",i+1);
           
          int ctr1=i;
           if(ctr1>-1)
           {  
               I++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return I;
    }
        
         
         public static int letterJ( String inputSentence, int J)
    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("j",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               J++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return J;
    }
         
        public static int letterK( String inputSentence, int K)
    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("k",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               K++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return K;
    }
        
        public static int letterL( String inputSentence, int L)
    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("l",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               L++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
        
     return L;
    }
        
        public static int letterM( String inputSentence, int M)
    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("m",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               M++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return M;
    }
        
    public static int letterN( String inputSentence, int N)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("n",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               N++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return N;
    }
    
    public static int letterO( String inputSentence, int O)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("o",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               O++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return O;
    }
    
    public static int letterP( String inputSentence, int P)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("p",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               P++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return P;
    }
    
     public static int letterQ( String inputSentence, int Q)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("q",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               Q++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return Q;
    }
    
    public static int letterR( String inputSentence, int R)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("r",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               R++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return R;
    }
    
    public static int letterS( String inputSentence, int S)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("s",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               S++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return S;
    }
    
    public static int letterT( String inputSentence, int T)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("t",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               T++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return T;
    }
    
    public static int letterU( String inputSentence, int U)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("u",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               U++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return U;
    }
    
    public static int letterV( String inputSentence, int V)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("v",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               V++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return V;
    }
    
     public static int letterW( String inputSentence, int W)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("w",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               W++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return W;
    }
     
    public static int letterX( String inputSentence, int X)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("x",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               X++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return X;
    }
    
    public static int letterY( String inputSentence, int Y)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("y",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               Y++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return Y;
    }
    
    public static int letterZ( String inputSentence, int Z)

    {
     int index=-1; 
     
     for(int ctr=0; ctr<inputSentence.length(); ctr++)
        {
         index=inputSentence.indexOf("z",index+1);
           
          int ctr1=index;
           if(ctr1>-1)
           {  
               Z++;
               ctr1=-1;
           }
           
           else
           {
             break;  
           }
        }
     return Z;
    }
}



