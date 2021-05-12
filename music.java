/**
 * Ahmed
 * may 2
 */
import java.util.Scanner;
public class music{
    public static void main(String[] args){
    Scanner first = new Scanner(System.in);
    Scanner sec = new Scanner(System.in);
    Scanner third = new Scanner(System.in);
    Scanner fourth = new Scanner(System.in);
    Scanner fifth = new Scanner(System.in);
    Scanner sixth = new Scanner(System.in);
    String title1, artist1;
    int playtime, numsongs, delete1;
    int x = 1;
    String[] playtimemin = {"20min ", "30min ", "70min ", "50min ", "55min "};
    String[] songcount = {"23songs ", "14songs ", "28songs ", "20songs ", "19songs "};
    String[] title = {"title: night ", "title: workout ", "title: country ", "title: roadtrip ", "title: party "};
    String[] Artist = {"by popsmoke ", "by liltjay ", "by lilbaby ", "by don ", "by drake "};
    String album1 = title[0] +  Artist[0] + songcount[0]+ playtimemin[0];
    String album2 = title[1] +  Artist[1] + songcount[1]+ playtimemin[1];
    String album3 = title[2] +  Artist[2] + songcount[2]+ playtimemin[2];
    String album4 = title[3] +  Artist[3] + songcount[3]+ playtimemin[3];
    String album5 = title[4] +  Artist[4] + songcount[4]+ playtimemin[4];
    String library = ("Library: |"+album1+"|"+album2+"|"+album3+"|"+album4+"|"+album5+"|");
   while(x==1){
    System.out.println(library);
    System.out.println("Hello, above is the defualt library with 5 albums. To add an album press 1. To delete an album press 2. To double the albums in the library press 3. To end and display the final library press 4");
    int response = first.nextInt();
    if(response == 1){
       System.out.println("what is the title of new album?");
       title1 = sec.nextLine();
       System.out.println("who is the artist?");
       artist1 = third.nextLine();
       System.out.println("how many songs?");
       numsongs = fourth.nextInt();
       System.out.println("How many min?");
       playtime = sec.nextInt();
       String album6 = ("title: "+title1+"by: "+artist1+"songcount: "+numsongs+"playtime: "+playtime);
       String newlibrary = library+album6;
       System.out.println("Your new library: "+newlibrary);
       x+=1;}
    if(response == 2){
       System.out.println("which album would you like to delete press 1,2,3,4, or 5");
       delete1= sixth.nextInt();
       if(delete1==1){
       library = ("Library: |"+album2+"|"+album3+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==2){
       library = ("Library: |"+album1+"|"+album3+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==3){
       library = ("Library: |"+album1+"|"+album2+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==4){
       library = ("Library: |"+album1+"|"+album2+"|"+album3+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==5){
       library = ("Library: |"+album1+"|"+album2+"|"+album3+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       x+=1;
    }
    if(response == 3){
        int y = (int)((Math.random()*4) +1);
        int z = (int)((Math.random()*4) +1);
        int c = (int)((Math.random()*4) +1);
        int r = (int)((Math.random()*4) +1);
    String album6 = title[y] +  Artist[z] + songcount[c]+ playtimemin[r];
    String album7 = title[r] +  Artist[y] + songcount[z]+ playtimemin[c];
    String album8 = title[c] +  Artist[r] + songcount[y]+ playtimemin[z];
    String album9 = title[y] +  Artist[y] + songcount[y]+ playtimemin[y];
    String album10 = title[y] +  Artist[y] + songcount[c]+ playtimemin[c];
    String doubleLibrary = library+ "|"+album6+"|"+album7+"|"+album8+"|"+album9+"|"+album10+"|";
    System.out.println(doubleLibrary);
    x+=1;}
    if(response == 4){
       x+=1;}
   }
   Scanner seventh = new Scanner(System.in);
   Scanner eighth = new Scanner(System.in);
   Scanner nine = new Scanner(System.in);
   int w=1;
   while(w==1){
    System.out.println("would you like to search the library? To search by album name press 1. To search by artist press 2. To end press 3");
    int answer = seventh.nextInt();
    if(answer ==1){
    System.out.println("what is the name of the album?");
    String name = eighth.nextLine();
    int found =0;
    for (int i=0; i < title.length; i++){
     if(title[i].equals(name)) {
     found++;
     }
     if(found > 0)
     {
     System.out.println(name+ " was found in this library");
     }
     else
     {
     System.out.println(name+" is not a valid album in the library");
     w+=1;}
   }
   }  
   if(answer ==2){
   System.out.println("what is the name of the artist?");
    String artistt = nine.nextLine();
    int found =0;
    for (int i=0; i < title.length; i++){
     if(Artist[i].equals(artistt)) {
     found++;
     }
     if(found > 0)
     {
     System.out.println(artistt+ " was found in this library");
     }
     else
     {
     System.out.println(artistt+" is not an artist in the library");
     w+=1;}
   }
    }
   if(answer ==3){
    w+=1;} 
  }
 }
}