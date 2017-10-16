import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		/*String cad1="",cad2="s";
		int i=0,j=1,r;
		float d=3.141592678f,c=10.3443434343f,rf;
		System.out.println("Suma: "+(r=i+j)+"\n"+(j+d));*/
		int a=8,b=81,c=2;
		double x1,x2;
		System.out.println((x1=((-b)+Math.sqrt((b^2)-(4*a*c)))/(2*a))+"\n"+
				(x2=((-b)-Math.sqrt((b^2)-(4*a*c)))/(2*a)));
		
		String cadena = "Parangaricutirimicuaro";
		
		System.out.println("/////////////////cadena/////////////////////");
		System.out.println("");
		System.out.println("\n");
		String cadenaCesar = "abcdefghijklmnopqrstuvwxyz";
		int espacio = 3;
		System.out.println(cadena);
		for(int x = 0; x < cadena.length(); x++){
			System.out.println(cadena.charAt(x));
			cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x + espacio));
		}
		System.out.println(cadena);
		System.out.println(cadena.substring(3,  6));
		System.out.println(cadena.toUpperCase());
		
		//Arrays
		String [] meses = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",};
		String [] sem = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; 		
		System.out.print(meses[0]+" "+meses[6]+" "+meses[10]+" "+meses[11]+" "+meses[2]+" "+sem[0]+" "+sem[4]+" "+sem[1]+" ");
		System.out.println(cadena);
		
		
		boolean x = true;
		boolean ac = false;
		/*System.out.println("\n\n");
		//System.out.println(x = ac);
		if(x == ac){
			System.out.println("Chana!!!");
		}
		else if (x == ac){
			System.out.println("Juliana!!!");
		}
		else if (x == ac){
			System.out.println("Melonazo!!!");
		}
		else if (!x == !ac){
			System.out.println("Sandiazo!!!");
		}
		else if(!(x == !ac)){
			System.out.println("Viejononazo!!!");
		}
		else {
			System.out.println("Ni moñazo!!!");
		}
		*/
		
		
		System.out.println("\n\n");
		
		String opcion = "Chana";
		Scanner lector = new Scanner(System.in);
		opcion = lector.nextLine();
		
		switch(opcion){
		case "Chana":
			System.out.println("Chana!!");
			break;
	
		case "Juana":
		System.out.println("Juana!!");
		break;
		
		case "Chona":
		System.out.println("Chona!!");
		break;
		
		default:
		System.out.println("Ninguno!!");
		break;
	
		
		}
		
		
	}
}
