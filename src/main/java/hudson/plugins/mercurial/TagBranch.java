package hudson.plugins.mercurial;

/** POJO that contains tag or/and branch that want to check-out
 * @author : christophe mourette
 */
public class TagBranch {
    private String tag;
    private String branch;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}
