/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.tables.records;

import edu.java.domain.jooq.tables.Chat;
import java.beans.ConstructorProperties;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "https://www.jooq.org",
                "jOOQ version:3.17.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ChatRecord extends UpdatableRecordImpl<ChatRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached ChatRecord
     */
    public ChatRecord() {
        super(Chat.CHAT);
    }

    /**
     * Create a detached, initialised ChatRecord
     */
    @ConstructorProperties({"id", "tgChatId"})
    public ChatRecord(@NotNull Integer id, @NotNull Integer tgChatId) {
        super(Chat.CHAT);

        setId(id);
        setTgChatId(tgChatId);
    }

    /**
     * Create a detached, initialised ChatRecord
     */
    public ChatRecord(edu.java.domain.jooq.tables.pojos.Chat value) {
        super(Chat.CHAT);

        if (value != null) {
            setId(value.getId());
            setTgChatId(value.getTgChatId());
        }
    }

    /**
     * Getter for <code>CHAT.ID</code>.
     */
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>CHAT.ID</code>.
     */
    public void setId(@NotNull Integer value) {
        set(0, value);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>CHAT.TG_CHAT_ID</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getTgChatId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CHAT.TG_CHAT_ID</code>.
     */
    public void setTgChatId(@NotNull Integer value) {
        set(1, value);
    }

    @Override
    @NotNull
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    @NotNull
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return Chat.CHAT.ID;
    }

    @Override
    @NotNull
    public Field<Integer> field2() {
        return Chat.CHAT.TG_CHAT_ID;
    }

    @Override
    @NotNull
    public Integer component1() {
        return getId();
    }

    @Override
    @NotNull
    public Integer component2() {
        return getTgChatId();
    }

    @Override
    @NotNull
    public Integer value1() {
        return getId();
    }

    @Override
    @NotNull
    public Integer value2() {
        return getTgChatId();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public ChatRecord value1(@NotNull Integer value) {
        setId(value);
        return this;
    }

    @Override
    @NotNull
    public ChatRecord value2(@NotNull Integer value) {
        setTgChatId(value);
        return this;
    }

    @Override
    @NotNull
    public ChatRecord values(@NotNull Integer value1, @NotNull Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }
}
