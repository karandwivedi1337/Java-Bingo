import javax.swing.*;
import java.io.*;
import java.lang.String.*;
import java.lang.Math.*;
class bingotrial{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
JOptionPane.showMessageDialog(null,"      WELCOME  TO   BINGO","Karan",JOptionPane.INFORMATION_MESSAGE);
String aa,bb,po,pop,tempp,p1,p2,in,remm,exam;
int b=1;
int a=1;
int v,rem,digcount,digcountt,y,yy,u,uu,qa,uyy,max,maxpos,placerow,placecol,ttstore;
int check1,check2,diag1,diag2,plprog;
int check3,check4,diag3,diag4,compprog,storelen;
int tempcompprog,row,column,diago1,diago2;
ttstore=0;
String num[][]=new String[5][5];//computer's playing array
int num1[][]=new int[5][5];
String arr[][]=new String[5][5];//player's playing array
int arr1[][]=new int[5][5];
String comp[][]=new String[5][5];//computer's display array
String tempcomp[][]=new String[5][5];//temporary computer array for thinking
String fal[][]=new String[5][5];
String faltoo[]=new String[25];
int number[]=new int[25];
String kkkk="",kkkkk="",kkk="";
String putcheck[][]=new String[5][5];
int stt[]=new int[25];
for(int sstt=0;sstt<25;sstt++){
stt[sstt]=-1;}
exam="";
remm="";
int ssss=1,am=0;
placerow=placecol=0;
for(int vb=0;vb<5;vb++){
for(int nb=0;nb<5;nb++){
String put=String.valueOf(ssss);
fal[vb][nb]=put;
ssss++;
}}
int sstt=0;
po=" ";
p1=" ";
for(int i=0;i<25;i++)
number[i]=i+1;

JOptionPane.showMessageDialog(null," Start  Inputing  Your  Square ","BINGO",JOptionPane.INFORMATION_MESSAGE);

for(int q=0;q<5;q++){
for(int w=0;w<5;w++){
digcount=0;
kkkkk="";
kkk="";
for(int i=0;i<25;i++){
if(number[i]!=0) kkkkk+=number[i]+" ";}
for(int i=0;i<kkkkk.length()-1;i++)
kkk+=kkkkk.charAt(i);
/*
kkkk="";
ab:for(int i=1;i<=25;i++)
{
for(int j=0;j<25;j++)
if(i==stt[j])
continue ab;
kkkk+=i+",";
}
*/
String k=JOptionPane.showInputDialog("Enter number--"+b+"\n"+"Remaining elements--"+kkk);
remm="";
b++;
int l=Integer.parseInt(k);
for(int i=0;i<25;i++){
if(number[i]==l)
number[i]=0;}
arr1[q][w]=l;
int yu=arr1[q][w];
while(yu!=0){
digcount++;
yu/=10;}
if(digcount==1){          // taking input of player's square
arr[q][w]="0"+k;}
else{
arr[q][w]=k;}


}
}
po+="     PLAYER'S SQUARE"+"\n"+" ";


for(y=0;y<5;y++){
for(u=0;u<5;u++){
if(y==0){
if(u<4){
po+=arr[y][u]+"     ";}
else{
po+=arr[y][u]+"     "+"\n";} //compliling player's square
}
if(y>0){
if(u<4){
po+=" "+arr[y][u]+"    ";}
else{
po+=" "+arr[y][u]+"    "+"\n";}
}


}}
po+="----------------------------------"+"\n";
po+="  COMPUTER'S SQUARE"+"\n"+" ";
pop="";
for(int ii=0;ii<5;ii++){
for(int jj=0;jj<5;jj++){        //shuffling the matrix
num[4-jj][ii]=arr[jj][ii];
}}
int cc=2,dd=4;
for(int ui=2;ui<5;ui++){
tempp=num[cc][ui-2];             //shuffling the matrix
num[cc][ui-2]=num[cc][dd];
num[cc][dd]=tempp;
dd--;}


for(int tt=0;tt<5;tt++){        //empty square of computer's 
for(int qq=0;qq<5;qq++){
comp[tt][qq]="  ";
System.out.print(num[tt][qq]+"   ");}
System.out.println();
}



for(yy=0;yy<5;yy++){
for(uu=0;uu<5;uu++){
if(yy==0){
if(uu<4){
pop+=comp[yy][uu]+"     ";}
else{ 
pop+=comp[yy][uu]+"     "+"\n";}          //compliling computer's square
}
if(yy>0){
if(uu<4){
pop+=" "+comp[yy][uu]+"    ";}
else{
pop+=" "+comp[yy][uu]+"    "+"\n";}
}


}}
JOptionPane.showMessageDialog(null,po+pop,"BINGO",JOptionPane.INFORMATION_MESSAGE);

uyy=0;

for(int pl=1;pl<50;pl++){
storelen=25-pl;
digcountt=0;
check1=check2=diag1=diag2=plprog=0;
check3=check4=diag3=diag4=compprog=0;

if(pl==1){

JOptionPane.showMessageDialog(null,"   The Computer Plays "+num[2][2],"Bingo",JOptionPane.INFORMATION_MESSAGE);
comp[2][2]="***";
for(int se=0;se<5;se++){
for(int es=0;es<5;es++){
if(arr[se][es].equals(num[2][2]))
arr[se][es]="***";}}
}
else{
JOptionPane.showMessageDialog(null,"   The Computer Plays "+num[placerow][placecol],"Bingo",JOptionPane.INFORMATION_MESSAGE); 
comp[placerow][placecol]="***";
for(int sse=0;sse<5;sse++){
for(int ses=0;ses<5;ses++){
if(arr[sse][ses].equals(num[placerow][placecol]))
arr[sse][ses]="***";}}

}

int keeppos[]=new int[25];
in=JOptionPane.showInputDialog("Your chance-Enter the number to play");
int yyu=Integer.parseInt(in);
while(yyu!=0){
digcountt++;
yyu/=10;}
if(digcountt==1){
in="0"+in;}

for(int kk=0;kk<5;kk++){
for(int gg=0;gg<5;gg++){
if(arr[kk][gg].equals(in)){
arr[kk][gg]="***";

}                      //substituting played number by ***
if(num[kk][gg].equals(in)){
comp[kk][gg]="***";
num[kk][gg]="***";
ttstore=kk*10+gg;
}

}}
stt[sstt]=ttstore;
sstt++;
p1+="     PLAYER'S SQUARE"+"\n"+" ";
for(int ay=0;ay<5;ay++){
for(int au=0;au<5;au++){
if(ay==0){
if(au<4){
p1+=arr[ay][au]+"     ";}
else{
p1+=arr[ay][au]+"     "+"\n";} //recompliling player's square after taking input
}
if(ay>0){
if(au<4){
p1+=" "+arr[ay][au]+"    ";}
else{
p1+=" "+arr[ay][au]+"    "+"\n";}
}


}}
p1+="----------------------------------"+"\n";
p1+="  COMPUTER'S SQUARE"+"\n"+" ";
p2="";


for(int ayy=0;ayy<5;ayy++){
for(int auu=0;auu<5;auu++){
if(ayy==0){
if(auu<4){
p2+=comp[ayy][auu]+"     ";}
else{ 
p2+=comp[ayy][auu]+"     "+"\n";}          //recompliling computer's square after taking input
}
if(ayy>0){
if(auu<4){
p2+=" "+comp[ayy][auu]+"    ";}
else{
p2+=" "+comp[ayy][auu]+"    "+"\n";}
}


}}



JOptionPane.showMessageDialog(null,p1+p2,"BINGO",JOptionPane.INFORMATION_MESSAGE);

p1=p2=" ";


//Starting to write AI
check1=check2=diag1=diag2=plprog=0;
int store[]=new int[25];
for(int xc=0;xc<5;xc++){
for(int cx=0;cx<5;cx++){
//if(!num[xc][cx].equals("***"))               //storing addresses of unfilled areas
store[uyy]=xc*10+cx;
uyy++;
}}

uyy=0;

tempcompprog=row=column=diago1=diago2=0;
for(int ccd=0;ccd<5;ccd++){
for(int fg=0;fg<5;fg++){
putcheck[ccd][fg]=num[ccd][fg];}}
boolean b11=true;
for(int c1=0;c1<25;c1++){
for(int cc1=0;cc1<25;cc1++)
{
if(stt[cc1]==store[c1])
b11=false;
}
if(b11){
int col=store[c1]%10;
int ro=store[c1]/10;                   //extracting row and column of unfilled area
putcheck[ro][col]="***";
for(int d1=0;d1<5;d1++){
for(int e1=0;e1<5;e1++){

if(putcheck[d1][e1].equals("***"))
row++;
if(putcheck[e1][d1].equals("***"))         //checking for profit by putting *** in unfilled area
column++;
}//e1 loop close
if(row==5){
tempcompprog++;}
if(column==5){
tempcompprog++;}
row=column=0;
if(putcheck[d1][d1].equals("***"))
diago1++;                                    //Sample Of Artificial intelligence
if(putcheck[d1][4-d1].equals("***"))
diago2++;

}//d1 loop close

if(diago1==5){
tempcompprog++;}
if(diago2==5){
tempcompprog++;}

keeppos[c1]=tempcompprog;                     //storing profit for later comparison in array
tempcompprog=0;

tempcompprog=row=column=diago1=diago2=0;
putcheck[ro][col]=num[ro][col];
}//if b11 close
}//c1 close
max=0;
maxpos=0;
max=keeppos[24];
for(int calc=23;calc>0;calc--){
b11=true;
for(int cc1=0;cc1<25;cc1++)
{
if(stt[cc1]==store[calc])
b11=false;
}
if(b11){

if(keeppos[calc]>=max){
max=keeppos[calc];
maxpos=calc;
}
}}
placerow=placecol=0;
placerow=store[maxpos]/10;
placecol=store[maxpos]%10;
System.out.print("placerow-"+placerow+"    "+"placecol-"+placecol);
System.out.println("SSTT-"+sstt);
stt[sstt]=placerow*10+placecol;
sstt++;


for(int sa=0;sa<5;sa++){
for(int as=0;as<5;as++){
if(arr[sa][as].equals("***"))
check1++;
if(arr[as][sa].equals("***"))
check2++;
}//as close
if(check1==5){
plprog++;}
if(check2==5){
plprog++;}            //checking r,c,d for player's square
check1=check2=0;
if(arr[sa][sa].equals("***"))
diag1++;
if(arr[sa][4-sa].equals("***"))
diag2++;
}//sa close

if(diag1==5)
plprog++;
if(diag2==5)
plprog++;


for(int ssa=0;ssa<5;ssa++){
for(int aas=0;aas<5;aas++){
if(num[ssa][aas].equals("***"))
check3++;
if(num[aas][ssa].equals("***"))
check4++;
}//as close
if(check3==5){
compprog++;}
if(check4==5){
compprog++;}            //checking r,c,d for computer's square
check3=check4=0;
if(num[ssa][ssa].equals("***"))
diag3++;
if(num[ssa][4-ssa].equals("***"))
diag4++;
}//ssa close

if(diag3==5)
compprog++;
if(diag4==5)
compprog++;

if(plprog==5){
JOptionPane.showMessageDialog(null,"         Player wins"+"\n"+"     Thank You For Playing","Bingo",JOptionPane.ERROR_MESSAGE);
System.exit(0);
}
if(compprog==5){
JOptionPane.showMessageDialog(null,"      Computer wins"+"\n"+"     Thank You For Playing","Bingo",JOptionPane.ERROR_MESSAGE);
System.exit(0);}

}//main pl close


}//main close
}//class close
