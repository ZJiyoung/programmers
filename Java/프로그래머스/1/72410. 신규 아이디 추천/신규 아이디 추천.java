// 유저 아이디 생성 업무 
// 규칙(3개)에 맞지 않는 아이디이면(7단계 프로세스) -> 유사하면서 && 규칙에 맞는 아이디 추천

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 7단계 프로세스 
        // 대문자를 소문자로
        new_id = new_id.toLowerCase();
        // 정규표현식 (Regex)
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        // 5단계 
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        // 6단계 
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15); // Java에서 String은 배열처럼 []로 접근 X
            new_id = new_id.replaceAll("[.]$", "");
        }
        // 7단계 
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        
        answer = new_id;
        return answer;
    }
}