import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class {
    private static int globalCounter = 1;
    private Map<Integer, String> students;
    private Map<String, Integer> grades;

    public Class() {
        students = new HashMap<Integer, String>();
        grades = new HashMap<String, Integer>();
    }

    public void addStudent(String name, int id) {
        students.put(id, name);
    }

    public void addGrade(String name, int grade) {
        Iterator it = students.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(name.compareTo((String)pair.getValue()) == 0) {
                String tempId = pair.getKey().toString() + globalCounter;
                globalCounter++;
                grades.put(tempId, grade);
            }
        }
    }

    public void addGrade(int id, int grade) {
        String tempId = id + "" + globalCounter;
        globalCounter++;
        grades.put(tempId, grade);
    }

    public int getGrade(String name, int index) {
        Iterator it = students.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(name.compareTo((String)pair.getValue()) == 0) {
                int key = (int)pair.getKey();
                Iterator next = grades.entrySet().iterator();
                Map.Entry nextPair = null;
                while(next.hasNext()) {
                    nextPair = (Map.Entry)next.next();
                    String tempId = nextPair.getKey().toString();
                    String compareId = Integer.toString(key) + index;
                    if(tempId.compareTo(compareId) == 0)
                        return (int)nextPair.getValue();
                }
            }
        }
        return 0;
    }

    public int getGrade(int id, int index) {
        Iterator next = grades.entrySet().iterator();
        Map.Entry nextPair = null;
        while(next.hasNext()) {
            nextPair = (Map.Entry)next.next();
            String tempId = nextPair.getKey().toString();
            String compareId = Integer.toString(id) + index;
            System.out.println(tempId + " / " + compareId);
            if(tempId.compareTo(compareId) == 0)
                return (int)nextPair.getValue();
        }
        return 0;
    }
}
