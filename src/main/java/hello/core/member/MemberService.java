package hello.core.member;

public interface MemberService {

    // 멤버 가입
    void join(Member member);

    // 멤버 조회
    Member findMember(Long memberId);
}
