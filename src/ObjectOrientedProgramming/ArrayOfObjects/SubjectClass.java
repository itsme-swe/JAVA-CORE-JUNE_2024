package ObjectOrientedProgramming.ArrayOfObjects;

public class SubjectClass {

    //1️⃣ Properties
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    //2️⃣ Constructor
    public SubjectClass(String subID, String name, int maxMarks)
    {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    //3️⃣ getter() method for all properties
    public String getSubID()
    {
        return subID;
    }

    public String getName()
    {
        return name;
    }

    public int getMaxMarks()
    {
        return maxMarks;
    }

    public int getMarksObtained()
    {
        return marksObtained;
    }

    //4️⃣ setter() method for maxMarks and marksObtained
    public void setMaxMarks(int mm)
    {
        maxMarks = mm;
    }

    public void setMarksObtained(int mo)
    {
        marksObtained = mo;
    }

    boolean isQualified(int mo)
    {
        return mo >= maxMarks/10*4;
    }

    public String toString()
    {
        return "\nSubjectID:" + subID + "\nName: " + name + "\nMarks Obtained: " + marksObtained;
    }

}
