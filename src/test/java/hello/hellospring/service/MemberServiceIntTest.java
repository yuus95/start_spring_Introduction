package hello.hellospring.service;


import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class MemberServiceIntTest {


    @Autowired MemberService memberService;
    @Autowired
    MemberRepository memberRepository;


    @Test
    void join() {
        Member member1 = new Member();
        member1.setName("Hello");
        Long memberId = memberService.join(member1);
        System.out.println("================");

        Member byId = memberRepository.findById(member1.getId()).get();

        Assertions.assertEquals(member1,byId);

    }

    @Test
    void findMember() {
    }

    @Test
    void findOne() {
    }


}
