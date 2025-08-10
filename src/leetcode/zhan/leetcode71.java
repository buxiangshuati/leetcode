package leetcode.zhan;

import java.util.ArrayList;

public class leetcode71 {
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        leetcode71 lc = new leetcode71();
        System.out.println(lc.simplifyPath(path));
    }
    public String simplifyPath(String path) {
        // 用"/"分割path
        // 如果碰到 空字符 或者 "." 就跳过什么也不做
        // 如果不是".." 那么就入栈
        // 如果碰到 ".."则表示返回上级目录 那么就将栈顶元素出栈 （模拟返回上级目录）
        ArrayList<String> res = new ArrayList<>();
        for(String s:path.split("/")){
            if(s.isEmpty() || s.equals(".")){ // 关注内容是否相等 那么使用equals来比较 关注s的值是否为空字符串 isEmpty
                continue;
            }
            if(!s.equals("..")){
                res.add(s);
            }else if(!res.isEmpty()){
                res.remove(res.size()-1);//移除最后一个元素
            }
        }
        return "/"+String.join("/",res);
    }
}
