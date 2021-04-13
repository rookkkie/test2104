import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;

import javax.annotation.Resource;

public class Test01
{
    @Resource
    private StudentService ss;
    @Test
    public void test()
    {
        Student s=new Student();
        s.setId("A0006");
        s.setName("cxk");
        s.setAge(23);
        ss.save(s);
    }
}
