

/**
 * 添加到暂存区->提交到本地库：add -> commit
 */
//版本穿梭：左下角Git->log->右键 Checkout Revision

//创建分支：右下角master->New Branch
//切换分支：选中切换的分支->CheckOut
//合并分支：选中合并的分支->merge into Current

//连接到GitHub：settings->GitHub->添加GitHub账号
//创建远程仓库：VCS->Import into Version Control->Share Project

/*
    push操作：先添加到暂存和本地库再进行push操作 右键->Git->Repository->push
    pull操作：右键->Git->Repository->pull
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("git-test");
        System.out.println("second commit");
        System.out.println("Branch commit");
        System.out.println("push test");
        System.out.println("pull test");
    }
}
