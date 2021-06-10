package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;


public class MemoryMemberRepositoryTest {


    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }


    @Test
    public void save(){
        Member member = new Member();
        member.setName("Spring");
        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertEquals(member,null);

    }

    @Test
    public void findByname(){
        Member member1 = new Member();
        member1.setName("Hello1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Hello2");
        repository.save(member2);

        Member result = repository.findByName("Hello1").get();

        Assertions.assertEquals(member1,result);

    }

}
