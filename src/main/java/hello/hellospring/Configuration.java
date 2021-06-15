package hello.hellospring;


import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;

@org.springframework.context.annotation.Configuration
public class Configuration {

//    private final DataSource dataSource;
//
//    public Configuration(DataSource dataSource){
//        this.dataSource = dataSource;
//    }
//
//    private final EntityManager em;
//
//    public Configuration(EntityManager em){
//        this.em = em;
//    }

    private final MemberRepository memberRepository;

    public Configuration(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
////        return new MemoryMemberRepository();
////    return new JdbcMemberRepository(dataSource);
////        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }



}
