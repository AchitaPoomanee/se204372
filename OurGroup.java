import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Tanutcha"); //PUT YOUR NAME HERE
	groupMembers.add("Nalinthip"); 
	groupMembers.add("Achita");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
