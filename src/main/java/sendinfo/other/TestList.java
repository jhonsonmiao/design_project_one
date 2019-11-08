package sendinfo.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @className: TestList
 * @author: mxk
 * @date: 2019/7/29  17:12
 */
public class TestList {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(null);
        objects.add(null);
        System.out.println(objects.contains(null));
        System.out.println(objects.isEmpty());
        HashMap<Integer, student> integerstudentHashMap = new HashMap<>();
        student student = new student();
        for (int i = 0; i <10 ; i++) {
            student.setAge(new Random().nextInt());
            integerstudentHashMap.put(i,student);
        }
        System.out.println(integerstudentHashMap);




    }
}

class student {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
