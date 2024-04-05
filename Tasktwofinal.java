public class Tasktwofinal {

    public static void main(String[] args) {
        
    
int row=10;
int col=row;
int k=row/2;
int l=10;



char ch=65;
char ch1=(char)(65+col-1);

for(int i=1;i<=row;i++){
for(int j=1;j<=col;j++){
if(j==1){
    System.out.print("A");
}
else if(i<=col/2 && i==j){
    System.out.print(ch);
    }
    else if(i>col/2 && j==k){
        System.out.print(ch);
        }
        else if(i<=col/2 && j==l){
            System.out.print("A");
            }
            else if(i>col/2 && j==l){
            System.out.print("A");
            }
else if(j==col){
    System.out.print(ch);
}
else{
    System.out.print(" ");
}
}
if(i<row/2){
ch++;
l--;
}
if(i>row/2){
    ch--; 
    k--;
    l++;
}
System.out.println();
}


}
}