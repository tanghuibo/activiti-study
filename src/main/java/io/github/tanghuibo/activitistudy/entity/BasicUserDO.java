package io.github.tanghuibo.activitistudy.entity;

public class BasicUserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_user.id
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_user.name
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_user.id
     *
     * @return the value of basic_user.id
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_user.id
     *
     * @param id the value for basic_user.id
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_user.name
     *
     * @return the value of basic_user.name
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_user.name
     *
     * @param name the value for basic_user.name
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_user
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BasicUserDO other = (BasicUserDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_user
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_user
     *
     * @mbg.generated Wed Mar 18 01:26:53 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}