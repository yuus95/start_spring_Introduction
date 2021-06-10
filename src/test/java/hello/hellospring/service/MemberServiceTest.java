package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
        MemoryMemberRepository memberRepository;
        MemberService memberService;



        @AfterEach
        public void afterEach(){
            memberRepository.clearStore();
        }



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