package com.tongbanjie.raft.core.protocol;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/***
 * raft log 实体
 * @author banxia
 * @date 2017-11-14 17:17:45
 */
public class RaftLog {


    //  序号
    private long index;

    //  任期
    private long term;

    // 日志
    private byte[] content;


    public RaftLog() {

    }

    public RaftLog(long index, long term, byte[] content) {
        this.index = index;
        this.term = term;
        this.content = content;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public long getTerm() {
        return term;
    }

    public void setTerm(long term) {
        this.term = term;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }


    public RaftLog createCopy() {

        return new RaftLog(this.index, this.term, this.content);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}