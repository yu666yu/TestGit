package Test;

import com.test.mapper.UserMapper;
import com.test.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    private SqlSessionFactory sqlSessionFactory ;
   //表示运行测试代码前执行,给sqlSessionFactory赋值
    @Before
    public void InitialContext() throws IOException{
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream inputStream=Resources.getResourceAsStream("spring-mybatis.xml");
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        this.sqlSessionFactory=sqlSessionFactory;
    }
    //通过id查询用户
    @org.junit.Test
    public void findUserById(){
        //获取sqlsession
        SqlSession sqlSession=null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            //获取mapper接口代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(1);
            System.out.println(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

}
