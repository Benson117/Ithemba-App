
package ithemba.app;

class User {
    private String FName,SName,Relationship;
    private int IDNum;

public User(String FName, String SName, String Relationship,int IDNum)
{

    
    this.FName=FName;
    this.SName = SName;
    this.Relationship = Relationship;
    this.IDNum = IDNum;
    
    
}

public String getFName()

{
return FName;

}

public String getSName()

{
return SName;

}

public String getRelationship()

{
return Relationship;

}
        
        public int getIDNum(){
 return IDNum;

}

}