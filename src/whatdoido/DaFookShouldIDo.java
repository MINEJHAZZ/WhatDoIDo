//Created Using Java-N IDE - Android
//Made By MINEJHAZZ


package whatdoido;

//Imports/Resources needed
import java.util.*;
import java.util.concurrent.*;


public class DaFookShouldIDo {

//Line Breaks
static void FN(){
  System.out.print("\n\n\n\n");
}

static void TN(){
  System.out.println("\n");
}

static void SN(){
  System.out.print("\n");
}

//Sleeper/Pending
static void TT()throws InterruptedException{
  TimeUnit.SECONDS.sleep(2);
}

//Stop Process
static void Stop() throws InterruptedException{
  TN();
  System.out.println("Stopping process...");
  TimeUnit.SECONDS.sleep(3);
  SN();
  System.out.println("Success."); 
  TimeUnit.SECONDS.sleep(3);
  System.exit(0);
}

//Timeout Process
static void TimeOut() throws InterruptedException{
  FN();
  System.out.println("Oh just kill yourself already if \nyou still don't know what to do.");
  TT();
  System.out.println("Bye.");
  TT();
  Stop(); 
}

//Array Displayer V1
static String ArrDisp(String[] Arr) throws InterruptedException{
String Out = "";
  for(int i = 0;i < Arr.length;i++){
  if(Arr.length > (i + 1))
  {
    Out = Out + (Arr[i] + ", ");
  }
  else 
  {
    Out = Out + (Arr[i]);
  }
  }
  return Out;
}

//Array Displayer V2
static void PrintArr(String[] CLoad) throws InterruptedException{
int stm = 40;
  for(int i = 0;i < CLoad.length;i++){
    System.out.print(CLoad[i]);
    TimeUnit.MILLISECONDS.sleep(stm);
  }
  SN();
}

//Array Displayer V3
static void PrintArr2(String[] CLoad) throws InterruptedException{
int stm = 20;
  for(int i = 0;i < CLoad.length;i++){
    System.out.print(CLoad[i]);
    TimeUnit.MILLISECONDS.sleep(stm);
  }
  SN();
}


//Easter Egg 1(Ahegao)
static void EE() throws InterruptedException{
int stm = 40;

//Arrays/Image to display
String[] L1 = {"⠄", "⠄", "⠄", "⢰", "⣧", "⣼", "⣯", "⠄", "⣸", "⣠", "⣶", "⣶", "⣦", "⣾", "⠄", "⠄", "⠄", "⠄", "⡀", "⠄", "⢀", "⣿", "⣿", "⠄", "⠄", "⠄", "⢸", "⡇", "⠄", "⠄"};
String[] L2 = {"⠄", "⠄", "⠄", "⣾", "⣿", "⠿", "⠿", "⠶", "⠿", "⢿", "⣿", "⣿", "⣿", "⣿", "⣦", "⣤", "⣄", "⢀", "⡅", "⢠", "⣾", "⣛", "⡉", "⠄", "⠄", "⠄", "⠸", "⢀", "⣿", "⠄"};
String[] L3 = {"⠄", "⠄", "⢀", "⡋", "⣡", "⣴", "⣶", "⣶", "⡀", "⠄", "⠄", "⠙", "⢿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣴", "⣿", "⣿", "⣿", "⢃", "⣤", "⣄", "⣀", "⣥", "⣿", "⣿", "⠄"};
String[] L4 = {"⠄", "⠄", "⢸", "⣇", "⠻", "⣿", "⣿", "⣿", "⣧", "⣀", "⢀", "⣠", "⡌", "⢻", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⠿", "⠿", "⠿", "⣿", "⣿", "⣿", "⠄"};
String[] L5 = {"⠄", "⢀", "⢸", "⣿", "⣷", "⣤", "⣤", "⣤", "⣬", "⣙", "⣛", "⢿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡿", "⣿", "⣿", "⡍", "⠄", "⠄", "⢀", "⣤", "⣄", "⠉", "⠋", "⣰"};
String[] L6 = {"⠄", "⣼", "⣖", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⢿", "⣿", "⣿", "⣿", "⣿", "⣿", "⢇", "⣿", "⣿", "⡷", "⠶", "⠶", "⢿", "⣿", "⣿", "⠇", "⢀", "⣤"};
String[] L7 = {"⠘", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣽", "⣿", "⣿", "⣿", "⡇", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣷", "⣶", "⣥", "⣴", "⣿", "⡗"};
String[] L8 = {"⢀", "⠈", "⢿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡟", "⠄"};
String[] L9 = {"⢸", "⣿", "⣦", "⣌", "⣛", "⣻", "⣿", "⣿", "⣧", "⠙", "⠛", "⠛", "⡭", "⠅", "⠒", "⠦", "⠭", "⣭", "⡻", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡿", "⠃", "⠄"};
String[] L10 = {"⠘", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡆", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠹", "⠈", "⢋", "⣽", "⣿", "⣿", "⣿", "⣿", "⣵", "⣾", "⠃", "⠄"};
String[] L11 = {"⠄", "⠘", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⠄", "⣴", "⣿", "⣶", "⣄", "⠄", "⣴", "⣶", "⠄", "⢀", "⣾", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⠃", "⠄", "⠄"};
String[] L12 = {"⠄", "⠄", "⠈", "⠻", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡄", "⢻", "⣿", "⣿", "⣿", "⠄", "⣿", "⣿", "⡀", "⣾", "⣿", "⣿", "⣿", "⣿", "⣛", "⠛", "⠁", "⠄", "⠄", "⠄"};
String[] L13 = {"⠄", "⠄", "⠄", "⠄", "⠈", "⠛", "⢿", "⣿", "⣿", "⣿", "⠁", "⠞", "⢿", "⣿", "⣿", "⡄", "⢿", "⣿", "⡇", "⣸", "⣿", "⣿", "⠿", "⠛", "⠁", "⠄", "⠄", "⠄", "⠄", "⠄"};
String[] L14 = {"⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠉", "⠻", "⣿", "⣿", "⣾", "⣦", "⡙", "⠻", "⣷", "⣾", "⣿", "⠃", "⠿", "⠋", "⠁", "⠄", "⠄", "⠄", "⠄", "⠄", "⢀", "⣠", "⣴"};
String[] L15 = {"⣿", "⣿", "⣿", "⣶", "⣶", "⣮", "⣥", "⣒", "⠲", "⢮", "⣝", "⡿", "⣿", "⣿", "⡆", "⣿", "⡿", "⠃", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⣠", "⣴", "⣿", "⣿", "⣿"};

//Easter Egg Ahegao Start
TN();
System.out.println("Easter egg found!\nNow printing your prize.");
TN();

PrintArr(L1);
PrintArr(L2);
PrintArr(L3);
PrintArr(L4);
PrintArr(L5);
PrintArr(L6);
PrintArr(L7);
PrintArr(L8);
PrintArr(L9);
PrintArr(L10);
PrintArr(L11);
PrintArr(L12);
PrintArr(L13);
PrintArr(L14);
PrintArr(L15);
  
  TN();
  TimeUnit.MILLISECONDS.sleep(70);
  System.out.println("[You are now a man of culture.]");
  TN();
  
}


//Easter Egg 2(Padoru)
static void Padoru() throws InterruptedException{
int stm = 20;
int stm2 = 2;

//Arrays/Image to display
String[] L1 = {"⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⣀", "⣴", "⣾", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣷", "⣄", "⠄", "⠄", "⠄", "⠄" };
String[] L2 = {"⠄", "⠄", "⠄", "⠄", "⠄", "⢀", "⣀", "⣀", "⡀", "⠄", "⠄", "⠄", "⡠", "⢲", "⣾", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣷", "⡀", "⠄", "⠄" };
String[] L3 = {"⠄", "⠄", "⠄", "⠔", "⣈", "⣀", "⠄", "⢔", "⡒", "⠳", "⡴", "⠊", "⠄", "⠸", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡿", "⠿", "⣿", "⣿", "⣧", "⠄", "⠄" };
String[] L4 = {"⠄", "⢜", "⡴", "⢑", "⠖", "⠊", "⢐", "⣤", "⠞", "⣩", "⡇", "⠄", "⠄", "⠄", "⠙", "⢿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣆", "⠄", "⠝", "⠛", "⠋", "⠐" };
String[] L5 = {"⢸", "⠏", "⣷", "⠈", "⠄", "⣱", "⠃", "⠄", "⢠", "⠃", "⠐", "⡀", "⠄", "⠄", "⠄", "⠄", "⠙", "⠻", "⢿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡿", "⠛", "⠸", "⠄", "⠄", "⠄", "⠄" };
String[] L6 = {"⠈", "⣅", "⠞", "⢁", "⣿", "⢸", "⠘", "⡄", "⡆", "⠄", "⠄", "⠈", "⠢", "⡀", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠉", "⠙", "⠛", "⠛", "⠛", "⠉", "⠉", "⡀", "⠄", "⠡", "⢀", "⠄", "⣀" };
String[] L7 = {"⠄", "⠙", "⡎", "⣹", "⢸", "⠄", "⠆", "⢘", "⠁", "⠄", "⠄", "⠄", "⢸", "⠈", "⠢", "⢄", "⡀", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠃", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L8 = {"⠄", "⠄", "⠑", "⢿", "⠈", "⢆", "⠘", "⢼", "⠄", "⠄", "⠄", "⠄", "⠸", "⢐", "⢾", "⠄", "⡘", "⡏", "⠲", "⠆", "⠠", "⣤", "⢤", "⢤", "⡤", "⠄", "⣖", "⡇", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L9 = {"⣴", "⣶", "⣿", "⣿", "⣣", "⣈", "⣢", "⣸", "⠄", "⠄", "⠄", "⠄", "⡾", "⣷", "⣾", "⣮", "⣤", "⡏", "⠁", "⠘", "⠊", "⢠", "⣷", "⣾", "⡛", "⡟", "⠈", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L10 = {"⣿", "⣿", "⣿", "⣿", "⣿", "⠉", "⠒", "⢽", "⠄", "⠄", "⠄", "⠄", "⡇", "⣿", "⣟", "⣿", "⡇", "⠄", "⠄", "⠄", "⠄", "⢸", "⣻", "⡿", "⡇", "⡇", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L11 = {"⠻", "⣿", "⣿", "⣿", "⣿", "⣄", "⠰", "⢼", "⠄", "⠄", "⠄", "⡄", "⠁", "⢻", "⣍", "⣯", "⠃", "⠄", "⠄", "⠄", "⠄", "⠈", "⢿", "⣻", "⠃", "⠈", "⡆", "⡄", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L12 = {"⠄", "⠙", "⠿", "⠿", "⠛", "⣿", "⣶", "⣤", "⡇", "⠄", "⠄", "⢣", "⠄", "⠄", "⠈", "⠄", "⢠", "⠂", "⠄", "⠁", "⠄", "⡀", "⠄", "⠄", "⣀", "⠔", "⢁", "⠃", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L13 = {"⠄", "⠄", "⠄", "⠄", "⠄", "⣿", "⣿", "⣿", "⣿", "⣾", "⠢", "⣖", "⣶", "⣦", "⣤", "⣤", "⣬", "⣤", "⣤", "⣤", "⣴", "⣶", "⣶", "⡏", "⠠", "⢃", "⠌", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L14 = {"⠄", "⠄", "⠄", "⠄", "⠄", "⠿", "⠿", "⠟", "⠛", "⡹", "⠉", "⠛", "⠛", "⠿", "⠿", "⣿", "⣿", "⣿", "⣿", "⣿", "⡿", "⠂", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L15 = {"⠠", "⠤", "⠤", "⠄", "⠄", "⣀", "⠄", "⠄", "⠄", "⠑", "⠠", "⣤", "⣀", "⣀", "⣀", "⡘", "⣿", "⠿", "⠙", "⠻", "⡍", "⢀", "⡈", "⠂", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄" };
String[] L16 = {"⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠑", "⠠", "⣠", "⣴", "⣾", "⣿", "⣿", "⣿", "⣿", "⣿", "⣿", "⣇", "⠉", "⠄", "⠻", "⣿", "⣷", "⣄", "⡀", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄", "⠄"};

//Easter Egg Padoru Start
TN();
System.out.println("Easter egg Found!");
TN();
System.out.println(" KAZE NO YOU NI");
TimeUnit.SECONDS.sleep(stm2);
System.out.println(" TSUKIMIHARA WO");
TimeUnit.SECONDS.sleep(stm2);
System.out.print(" PADORU");
TimeUnit.SECONDS.sleep(1);
System.out.print(" PADORU");

for(int l = 0; l<10;l++){
  System.out.print("U");
  TimeUnit.MILLISECONDS.sleep(90);
}
TN();
TN();

PrintArr(L1);
PrintArr(L2);
PrintArr(L3);
PrintArr(L4);
PrintArr(L5);
PrintArr(L6);
PrintArr(L7);
PrintArr(L8);
PrintArr(L9);
PrintArr(L10);
PrintArr(L11);
PrintArr(L12);
PrintArr(L13);
PrintArr(L14);
PrintArr(L15);
PrintArr(L16);
  
  TN();
  TimeUnit.MILLISECONDS.sleep(70);
  System.out.println("[You have now sold your soul to the padoru gods.]");
  TN();
  
}

//Easter Egg 1(F U)
static void FU() throws InterruptedException{
int stm = 40;

//Arrays/Image to display
String L1S = "________________$$$$";
String L2S = "______________$$____$$";
String L3S = "______________$$____$$";
String L4S = "______________$$____$$";
String L5S = "______________$$____$$";
String L6S = "______________$$____$$";
String L7S = "__________$$$$$$____$$$$$$";
String L8S = "________$$____$$____$$____$$$$";
String L9S = "________$$____$$____$$____$$__$$";
String L10S = "$$$$$$__$$____$$____$$____$$____$$";
String L11S = "$$____$$$$________________$$____$$";
String L12S = "$$______$$______________________$$";
String L13S = "__$$____$$______________________$$";
String L14S = "___$$$__$$______________________$$";
String L15S = "____$$__________________________$$";
String L16S = "_____$$$________________________$$";
String L17S = "______$$______________________$$$";
String L18S = "_______$$$____________________$$";
String L19S = "________$$____________________$$";
String L20S = "_________$$$________________$$$";
String L21S = "__________$$________________$$";
String L22S = "__________$$$$$$$$$$$$$$$$$$$$";


String[] L1 = L1S.split("");
String[] L2 = L2S.split("");
String[] L3 = L3S.split("");
String[] L4 = L4S.split("");
String[] L5 = L5S.split("");
String[] L6 = L6S.split("");
String[] L7 = L7S.split("");
String[] L8 = L8S.split("");
String[] L9 = L9S.split("");
String[] L10 = L10S.split("");
String[] L11 = L11S.split("");
String[] L12 = L12S.split("");
String[] L13 = L13S.split("");
String[] L14 = L14S.split("");
String[] L15 = L15S.split("");
String[] L16 = L16S.split("");
String[] L17 = L17S.split("");
String[] L18 = L18S.split("");
String[] L19 = L19S.split("");
String[] L20 = L20S.split("");
String[] L21 = L21S.split("");
String[] L22 = L22S.split("");


//Easter Egg F U Start
TN();
System.out.println("Easter egg found!\nNow printing your prize.");
TN();

PrintArr2(L1);
PrintArr2(L2);
PrintArr2(L3);
PrintArr2(L4);
PrintArr2(L5);
PrintArr2(L6);
PrintArr2(L7);
PrintArr2(L8);
PrintArr2(L9);
PrintArr2(L10);
PrintArr2(L11);
PrintArr2(L12);
PrintArr2(L13);
PrintArr2(L14);
PrintArr2(L15);
PrintArr2(L16);
PrintArr2(L17);
PrintArr2(L18);
PrintArr2(L19);
PrintArr2(L20);
PrintArr2(L21);
PrintArr2(L22);
  

  TN();
  TimeUnit.MILLISECONDS.sleep(90);
  System.out.println("[Fook You Gae.]");
  TN();
  
}

public static void SE(){
    Scanner S = new Scanner(System.in);
    
    System.out.println("Press Any Key to exit program.");
    String p = S.nextLine();
    
    System.exit(0);
}


//Main Process Start
  public static void main(String[] args) throws InterruptedException {
  
  //Version Number
  String VN = "2.9";
  
  //App Name
  String AN = "\"Da Fook Should I Do\"";
  
  
  
  
  //Usables
  Scanner I = new Scanner(System.in);
  String c, Choose = "", numManager = null, ChooseMS = "", CMode;
  boolean CHS = true, creg = true, blank = true;
  ArrayList<String> CH = new ArrayList<String>();
  int l, cur = 1, ChooseM = 1, ranPH = 3;
  int ranran = new Random().nextInt(ranPH);
  String[] CLoad = {""};
  
  //Mode 2 Preset List Arrays
  String[] Load1 = {"Eat", "Sleep", "Watch", "Play"};
  String[] Load2 = {"Sleep", "Read", "Watch", "Play", "Work", "Code"};
  String[] Load3 = {"Read Manga", "Read Manhua", "Read Manhua", "Watch Anime"};
  
//Welcome Message 
System.out.println("Welcome to "+ AN + "\nCurrent Version: \nVersion " + VN);
FN();


//Mode Chooser
System.out.print("Which Mode Do you Wish To Choose?");
FN();
System.out.println("Mode 1:"
+ "\nEnter Custom Tasks");
SN();
System.out.println("Mode 2:"
+ "\nLoad Available Presets");
TN();
while (blank == true){
System.out.print("Enter Answer: ");
ChooseMS = I.nextLine();
switch (ChooseMS){
  case "1":
  case "1sk":
  case "Mode 1":
  blank = false;
  ChooseM = 1;
  break;
  case "2":
  case "2sk":
  case "Mode 2":
  blank = false;
  ChooseM = 2;
  break;
  case "AEE":
  case "aee":
  EE();
  SE();
  return;
  case "Padoru":
  case "Hashire":
  case "padoru":
  Padoru();
  SE();
  return;
  case "fu":
  case "FU":
  FU();
  SE();
  return;
  
  default:
  SN();
  System.out.println("Answer Not Valid.");
  TN();
  break;
}}
blank = true;
CMode = "Mode " + ChooseM + " ";
FN();
System.out.println(CMode + "Now Loading...");
SN();
if(ChooseMS.equalsIgnoreCase("1sk")||ChooseMS.equalsIgnoreCase("2sk")){
SN();
System.out.println("Fast Loading Activated.");
SN();
  for(int i = 0; i<20;i++){
    System.out.print(".");
    TimeUnit.MILLISECONDS.sleep(60);
  }
} else if (ChooseM == 1 || ChooseM == 2){
System.out.println("..");
TimeUnit.SECONDS.sleep(ranran);
System.out.println("...");
TimeUnit.SECONDS.sleep(ranran);
System.out.println("....");
TimeUnit.SECONDS.sleep(ranran);
System.out.println(".....");
TimeUnit.SECONDS.sleep(ranran);
}
TN();
System.out.println("Successfully Loaded " + CMode);
FN();
TT();



//Mode 1 Function Codes
if (ChooseM == 1){
while (CHS == true){
blank = true;
if (Integer.toString(cur).equals("2")){
  numManager = cur + "nd";
} else if (Integer.toString(cur).equals("3")){
  numManager = cur + "rd";
} else {
  numManager = cur + "th";
} 
if (creg == true){
while (blank == true){  
System.out.print("Enter Your 1st Task: ");
  Choose = I.nextLine();
  if (Choose.equals("")||Choose.equalsIgnoreCase("d")||Choose.equalsIgnoreCase("done")){
    System.out.println("\nError.\nTask cannot be blank.\n");
  } else {
    blank = false;
    cur++;
  } 
}  
  CH.add(Choose);
  creg = false;
} 
if (creg == false){
while (blank == true){  
System.out.print("Enter Your " + numManager + " Task: ");
  Choose = I.nextLine();
  if (Choose.equals("")){
    System.out.println("\nError.\nTask cannot be blank.\n");
  } else {
    blank = false;
    cur++;
  }
}  
  CH.add(Choose);
} 
if (Choose.equalsIgnoreCase("d") || Choose.equalsIgnoreCase("done")){
  CHS = false;
}
}
CH.remove(CH.size() - 1);
CH.remove(0);

//Randomized Picker Function Command Block For Mode 1
int ran = new Random().nextInt(CH.size());
for (l = CH.size(); l < (CH.size() + 15);l++){
ran = new Random().nextInt(CH.size());
System.out.println("\n\nRandom Number is: \"" + ran + "\"");
System.out.println("\n\nYou Should "+ CH.get(ran));

System.out.println("\nType E to exit, Press Enter to Reroll.");
c = I.nextLine();
if (c.equalsIgnoreCase("e") || c.equalsIgnoreCase("exit")){
  Stop();
  l=100;
}}
TimeOut();
}


//Mode 2 Function Codes
else if (ChooseM == 2)
{
  
  //Mode 2 Preset Picker Command Block
  System.out.println("Which Preset Do you Wish to load?");
  TN();
  System.out.println("Preset 1: ");
  System.out.println("(" + ArrDisp(Load1) + ")");
  TT();
  TN();
  System.out.println("Preset 2: ");
  System.out.println("(" + ArrDisp(Load2) + ")");
  TN();
  TT();
  System.out.println("Preset 3: ");
  System.out.println("(" + ArrDisp(Load3) + ")");
  TN();
  TT();
  
  while (blank == true){
System.out.print("Enter Answer: ");
ChooseMS = I.nextLine();
switch (ChooseMS){
  case "1":
  case "Preset 1":
  blank = false;
  CLoad = Load1.clone();
  ChooseM = 1;
  break;
  case "2":
  case "Preset 2":
  blank = false;
  CLoad = Load2.clone();
  ChooseM = 2;
  break;
  case "3":
  case "Preset 3":
  blank = false;
  CLoad = Load3.clone();
  ChooseM = 3;
  break;
  
  default:
  SN();
  System.out.println("Answer Not Valid.");
  TN();
  break;
}}
CMode = "Preset " + ChooseM + " ";
FN();
System.out.println(CMode + "Now Loading...");
SN();
System.out.println("..");
TimeUnit.SECONDS.sleep(ranran);
System.out.println("...");
TimeUnit.SECONDS.sleep(ranran);
System.out.println("....");
TimeUnit.SECONDS.sleep(ranran);
System.out.println(".....");
TimeUnit.SECONDS.sleep(ranran);
SN();
System.out.println("Successfully Loaded " + CMode);
FN();
TT();
  
  //Randomized Picker Function Command Block For Mode 1
int ran = new Random().nextInt(CLoad.length);
for (l = CLoad.length; l < (CLoad.length + 15);l++){
ran = new Random().nextInt(CLoad.length);
System.out.println("\n\nRandom Number is: \"" + ran + "\"");
System.out.println("\n\nYou Should "+ CLoad[ran]);

System.out.println("\nType E to exit, Press Enter to Reroll.");
c = I.nextLine();
if (c.equalsIgnoreCase("e") || c.equalsIgnoreCase("exit")){
  Stop();
  l=100;
}}
  TimeOut();
}
I.close();
}}