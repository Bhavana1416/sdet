
import java.util.HashSet;
public class Activity3_2 {
	public static void main(String[] args){
		HashSet<String> hs = new HashSet<>();
		hs.add("BB");
		hs.add("HH");
		hs.add("VV");
		hs.add("NN");
		hs.add("AA");
		hs.add("kk");
		System.out.println("Intitial hash set : "+hs);
		System.out.println("Removing VV from hash set");
		hs.remove("VV");
		System.out.println("hash set : "+hs);
		System.out.println("trying to remove ZZ from hash");
		if(hs.contains("ZZ"))
		{
		 System.out.println("ZZ is available in has set and removing it now");
		 hs.remove("ZZ");
		 System.out.println("ZZ is removed and updated Hash is : "+hs);
		}
		else
		System.out.println("ZZ IS not available to remove and below are the objects available in Hash set:"+hs);
		
		
	}
}
