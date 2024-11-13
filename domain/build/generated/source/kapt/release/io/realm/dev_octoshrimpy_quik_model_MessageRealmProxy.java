package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class dev_octoshrimpy_quik_model_MessageRealmProxy extends dev.octoshrimpy.quik.model.Message
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_MessageRealmProxyInterface {

    static final class MessageColumnInfo extends ColumnInfo {
        long idColKey;
        long threadIdColKey;
        long contentIdColKey;
        long addressColKey;
        long boxIdColKey;
        long typeColKey;
        long dateColKey;
        long dateSentColKey;
        long seenColKey;
        long readColKey;
        long lockedColKey;
        long subIdColKey;
        long bodyColKey;
        long errorCodeColKey;
        long deliveryStatusColKey;
        long attachmentTypeStringColKey;
        long mmsDeliveryStatusStringColKey;
        long readReportStringColKey;
        long errorTypeColKey;
        long messageSizeColKey;
        long messageTypeColKey;
        long mmsStatusColKey;
        long subjectColKey;
        long textContentTypeColKey;
        long partsColKey;

        MessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(25);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Message");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.threadIdColKey = addColumnDetails("threadId", "threadId", objectSchemaInfo);
            this.contentIdColKey = addColumnDetails("contentId", "contentId", objectSchemaInfo);
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
            this.boxIdColKey = addColumnDetails("boxId", "boxId", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.dateColKey = addColumnDetails("date", "date", objectSchemaInfo);
            this.dateSentColKey = addColumnDetails("dateSent", "dateSent", objectSchemaInfo);
            this.seenColKey = addColumnDetails("seen", "seen", objectSchemaInfo);
            this.readColKey = addColumnDetails("read", "read", objectSchemaInfo);
            this.lockedColKey = addColumnDetails("locked", "locked", objectSchemaInfo);
            this.subIdColKey = addColumnDetails("subId", "subId", objectSchemaInfo);
            this.bodyColKey = addColumnDetails("body", "body", objectSchemaInfo);
            this.errorCodeColKey = addColumnDetails("errorCode", "errorCode", objectSchemaInfo);
            this.deliveryStatusColKey = addColumnDetails("deliveryStatus", "deliveryStatus", objectSchemaInfo);
            this.attachmentTypeStringColKey = addColumnDetails("attachmentTypeString", "attachmentTypeString", objectSchemaInfo);
            this.mmsDeliveryStatusStringColKey = addColumnDetails("mmsDeliveryStatusString", "mmsDeliveryStatusString", objectSchemaInfo);
            this.readReportStringColKey = addColumnDetails("readReportString", "readReportString", objectSchemaInfo);
            this.errorTypeColKey = addColumnDetails("errorType", "errorType", objectSchemaInfo);
            this.messageSizeColKey = addColumnDetails("messageSize", "messageSize", objectSchemaInfo);
            this.messageTypeColKey = addColumnDetails("messageType", "messageType", objectSchemaInfo);
            this.mmsStatusColKey = addColumnDetails("mmsStatus", "mmsStatus", objectSchemaInfo);
            this.subjectColKey = addColumnDetails("subject", "subject", objectSchemaInfo);
            this.textContentTypeColKey = addColumnDetails("textContentType", "textContentType", objectSchemaInfo);
            this.partsColKey = addColumnDetails("parts", "parts", objectSchemaInfo);
        }

        MessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MessageColumnInfo src = (MessageColumnInfo) rawSrc;
            final MessageColumnInfo dst = (MessageColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.threadIdColKey = src.threadIdColKey;
            dst.contentIdColKey = src.contentIdColKey;
            dst.addressColKey = src.addressColKey;
            dst.boxIdColKey = src.boxIdColKey;
            dst.typeColKey = src.typeColKey;
            dst.dateColKey = src.dateColKey;
            dst.dateSentColKey = src.dateSentColKey;
            dst.seenColKey = src.seenColKey;
            dst.readColKey = src.readColKey;
            dst.lockedColKey = src.lockedColKey;
            dst.subIdColKey = src.subIdColKey;
            dst.bodyColKey = src.bodyColKey;
            dst.errorCodeColKey = src.errorCodeColKey;
            dst.deliveryStatusColKey = src.deliveryStatusColKey;
            dst.attachmentTypeStringColKey = src.attachmentTypeStringColKey;
            dst.mmsDeliveryStatusStringColKey = src.mmsDeliveryStatusStringColKey;
            dst.readReportStringColKey = src.readReportStringColKey;
            dst.errorTypeColKey = src.errorTypeColKey;
            dst.messageSizeColKey = src.messageSizeColKey;
            dst.messageTypeColKey = src.messageTypeColKey;
            dst.mmsStatusColKey = src.mmsStatusColKey;
            dst.subjectColKey = src.subjectColKey;
            dst.textContentTypeColKey = src.textContentTypeColKey;
            dst.partsColKey = src.partsColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MessageColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.Message> proxyState;
    private RealmList<dev.octoshrimpy.quik.model.MmsPart> partsRealmList;

    dev_octoshrimpy_quik_model_MessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.Message>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$threadId() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.threadIdColKey);
    }

    @Override
    public void realmSet$threadId(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.threadIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.threadIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$contentId() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.contentIdColKey);
    }

    @Override
    public void realmSet$contentId(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.contentIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.contentIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressColKey);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
            }
            row.getTable().setString(columnInfo.addressColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.addressColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$boxId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.boxIdColKey);
    }

    @Override
    public void realmSet$boxId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.boxIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.boxIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            }
            row.getTable().setString(columnInfo.typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.typeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateColKey);
    }

    @Override
    public void realmSet$date(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$dateSent() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateSentColKey);
    }

    @Override
    public void realmSet$dateSent(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateSentColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateSentColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$seen() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.seenColKey);
    }

    @Override
    public void realmSet$seen(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.seenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.seenColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$read() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.readColKey);
    }

    @Override
    public void realmSet$read(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.readColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.readColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$locked() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.lockedColKey);
    }

    @Override
    public void realmSet$locked(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.lockedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.lockedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$subId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.subIdColKey);
    }

    @Override
    public void realmSet$subId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.subIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.subIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$body() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bodyColKey);
    }

    @Override
    public void realmSet$body(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'body' to null.");
            }
            row.getTable().setString(columnInfo.bodyColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'body' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.bodyColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$errorCode() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.errorCodeColKey);
    }

    @Override
    public void realmSet$errorCode(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.errorCodeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.errorCodeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$deliveryStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.deliveryStatusColKey);
    }

    @Override
    public void realmSet$deliveryStatus(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.deliveryStatusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.deliveryStatusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$attachmentTypeString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.attachmentTypeStringColKey);
    }

    @Override
    public void realmSet$attachmentTypeString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentTypeString' to null.");
            }
            row.getTable().setString(columnInfo.attachmentTypeStringColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentTypeString' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.attachmentTypeStringColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mmsDeliveryStatusString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mmsDeliveryStatusStringColKey);
    }

    @Override
    public void realmSet$mmsDeliveryStatusString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mmsDeliveryStatusString' to null.");
            }
            row.getTable().setString(columnInfo.mmsDeliveryStatusStringColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'mmsDeliveryStatusString' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.mmsDeliveryStatusStringColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$readReportString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.readReportStringColKey);
    }

    @Override
    public void realmSet$readReportString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'readReportString' to null.");
            }
            row.getTable().setString(columnInfo.readReportStringColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'readReportString' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.readReportStringColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$errorType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.errorTypeColKey);
    }

    @Override
    public void realmSet$errorType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.errorTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.errorTypeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$messageSize() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.messageSizeColKey);
    }

    @Override
    public void realmSet$messageSize(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.messageSizeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.messageSizeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$messageType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.messageTypeColKey);
    }

    @Override
    public void realmSet$messageType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.messageTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.messageTypeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$mmsStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.mmsStatusColKey);
    }

    @Override
    public void realmSet$mmsStatus(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.mmsStatusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.mmsStatusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$subject() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.subjectColKey);
    }

    @Override
    public void realmSet$subject(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
            }
            row.getTable().setString(columnInfo.subjectColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.subjectColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$textContentType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.textContentTypeColKey);
    }

    @Override
    public void realmSet$textContentType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textContentType' to null.");
            }
            row.getTable().setString(columnInfo.textContentTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'textContentType' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.textContentTypeColKey, value);
    }

    @Override
    public RealmList<dev.octoshrimpy.quik.model.MmsPart> realmGet$parts() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (partsRealmList != null) {
            return partsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.partsColKey);
            partsRealmList = new RealmList<dev.octoshrimpy.quik.model.MmsPart>(dev.octoshrimpy.quik.model.MmsPart.class, osList, proxyState.getRealm$realm());
            return partsRealmList;
        }
    }

    @Override
    public void realmSet$parts(RealmList<dev.octoshrimpy.quik.model.MmsPart> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("parts")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<dev.octoshrimpy.quik.model.MmsPart> original = value;
                value = new RealmList<dev.octoshrimpy.quik.model.MmsPart>();
                for (dev.octoshrimpy.quik.model.MmsPart item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealmOrUpdate(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.partsColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                dev.octoshrimpy.quik.model.MmsPart linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                dev.octoshrimpy.quik.model.MmsPart linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Message", false, 25, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "threadId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "contentId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "boxId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dateSent", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "seen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "read", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "locked", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "subId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "body", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "errorCode", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "deliveryStatus", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "attachmentTypeString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "mmsDeliveryStatusString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "readReportString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "errorType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "messageSize", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "messageType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "mmsStatus", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "subject", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "textContentType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "parts", RealmFieldType.LIST, "MmsPart");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Message";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Message";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.Message createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        dev.octoshrimpy.quik.model.Message obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
            MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("parts")) {
                excludeFields.add("parts");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Message.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Message.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final dev_octoshrimpy_quik_model_MessageRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_MessageRealmProxyInterface) obj;
        if (json.has("threadId")) {
            if (json.isNull("threadId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'threadId' to null.");
            } else {
                objProxy.realmSet$threadId((long) json.getLong("threadId"));
            }
        }
        if (json.has("contentId")) {
            if (json.isNull("contentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'contentId' to null.");
            } else {
                objProxy.realmSet$contentId((long) json.getLong("contentId"));
            }
        }
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("boxId")) {
            if (json.isNull("boxId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'boxId' to null.");
            } else {
                objProxy.realmSet$boxId((int) json.getInt("boxId"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        if (json.has("dateSent")) {
            if (json.isNull("dateSent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateSent' to null.");
            } else {
                objProxy.realmSet$dateSent((long) json.getLong("dateSent"));
            }
        }
        if (json.has("seen")) {
            if (json.isNull("seen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seen' to null.");
            } else {
                objProxy.realmSet$seen((boolean) json.getBoolean("seen"));
            }
        }
        if (json.has("read")) {
            if (json.isNull("read")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
            } else {
                objProxy.realmSet$read((boolean) json.getBoolean("read"));
            }
        }
        if (json.has("locked")) {
            if (json.isNull("locked")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'locked' to null.");
            } else {
                objProxy.realmSet$locked((boolean) json.getBoolean("locked"));
            }
        }
        if (json.has("subId")) {
            if (json.isNull("subId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
            } else {
                objProxy.realmSet$subId((int) json.getInt("subId"));
            }
        }
        if (json.has("body")) {
            if (json.isNull("body")) {
                objProxy.realmSet$body(null);
            } else {
                objProxy.realmSet$body((String) json.getString("body"));
            }
        }
        if (json.has("errorCode")) {
            if (json.isNull("errorCode")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'errorCode' to null.");
            } else {
                objProxy.realmSet$errorCode((int) json.getInt("errorCode"));
            }
        }
        if (json.has("deliveryStatus")) {
            if (json.isNull("deliveryStatus")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'deliveryStatus' to null.");
            } else {
                objProxy.realmSet$deliveryStatus((int) json.getInt("deliveryStatus"));
            }
        }
        if (json.has("attachmentTypeString")) {
            if (json.isNull("attachmentTypeString")) {
                objProxy.realmSet$attachmentTypeString(null);
            } else {
                objProxy.realmSet$attachmentTypeString((String) json.getString("attachmentTypeString"));
            }
        }
        if (json.has("mmsDeliveryStatusString")) {
            if (json.isNull("mmsDeliveryStatusString")) {
                objProxy.realmSet$mmsDeliveryStatusString(null);
            } else {
                objProxy.realmSet$mmsDeliveryStatusString((String) json.getString("mmsDeliveryStatusString"));
            }
        }
        if (json.has("readReportString")) {
            if (json.isNull("readReportString")) {
                objProxy.realmSet$readReportString(null);
            } else {
                objProxy.realmSet$readReportString((String) json.getString("readReportString"));
            }
        }
        if (json.has("errorType")) {
            if (json.isNull("errorType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'errorType' to null.");
            } else {
                objProxy.realmSet$errorType((int) json.getInt("errorType"));
            }
        }
        if (json.has("messageSize")) {
            if (json.isNull("messageSize")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'messageSize' to null.");
            } else {
                objProxy.realmSet$messageSize((int) json.getInt("messageSize"));
            }
        }
        if (json.has("messageType")) {
            if (json.isNull("messageType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'messageType' to null.");
            } else {
                objProxy.realmSet$messageType((int) json.getInt("messageType"));
            }
        }
        if (json.has("mmsStatus")) {
            if (json.isNull("mmsStatus")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mmsStatus' to null.");
            } else {
                objProxy.realmSet$mmsStatus((int) json.getInt("mmsStatus"));
            }
        }
        if (json.has("subject")) {
            if (json.isNull("subject")) {
                objProxy.realmSet$subject(null);
            } else {
                objProxy.realmSet$subject((String) json.getString("subject"));
            }
        }
        if (json.has("textContentType")) {
            if (json.isNull("textContentType")) {
                objProxy.realmSet$textContentType(null);
            } else {
                objProxy.realmSet$textContentType((String) json.getString("textContentType"));
            }
        }
        if (json.has("parts")) {
            if (json.isNull("parts")) {
                objProxy.realmSet$parts(null);
            } else {
                objProxy.realmGet$parts().clear();
                JSONArray array = json.getJSONArray("parts");
                for (int i = 0; i < array.length(); i++) {
                    dev.octoshrimpy.quik.model.MmsPart item = dev_octoshrimpy_quik_model_MmsPartRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$parts().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.Message createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.Message obj = new dev.octoshrimpy.quik.model.Message();
        final dev_octoshrimpy_quik_model_MessageRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_MessageRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("threadId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$threadId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'threadId' to null.");
                }
            } else if (name.equals("contentId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contentId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'contentId' to null.");
                }
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
            } else if (name.equals("boxId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$boxId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'boxId' to null.");
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else if (name.equals("dateSent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dateSent((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateSent' to null.");
                }
            } else if (name.equals("seen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seen' to null.");
                }
            } else if (name.equals("read")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$read((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
                }
            } else if (name.equals("locked")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$locked((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'locked' to null.");
                }
            } else if (name.equals("subId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
                }
            } else if (name.equals("body")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$body((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$body(null);
                }
            } else if (name.equals("errorCode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$errorCode((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'errorCode' to null.");
                }
            } else if (name.equals("deliveryStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deliveryStatus((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'deliveryStatus' to null.");
                }
            } else if (name.equals("attachmentTypeString")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$attachmentTypeString((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$attachmentTypeString(null);
                }
            } else if (name.equals("mmsDeliveryStatusString")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mmsDeliveryStatusString((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mmsDeliveryStatusString(null);
                }
            } else if (name.equals("readReportString")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$readReportString((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$readReportString(null);
                }
            } else if (name.equals("errorType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$errorType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'errorType' to null.");
                }
            } else if (name.equals("messageSize")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$messageSize((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'messageSize' to null.");
                }
            } else if (name.equals("messageType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$messageType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'messageType' to null.");
                }
            } else if (name.equals("mmsStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mmsStatus((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'mmsStatus' to null.");
                }
            } else if (name.equals("subject")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subject((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$subject(null);
                }
            } else if (name.equals("textContentType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$textContentType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$textContentType(null);
                }
            } else if (name.equals("parts")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$parts(null);
                } else {
                    objProxy.realmSet$parts(new RealmList<dev.octoshrimpy.quik.model.MmsPart>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        dev.octoshrimpy.quik.model.MmsPart item = dev_octoshrimpy_quik_model_MmsPartRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$parts().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static dev_octoshrimpy_quik_model_MessageRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.Message copyOrUpdate(Realm realm, MessageColumnInfo columnInfo, dev.octoshrimpy.quik.model.Message object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.Message) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.Message realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.Message copy(Realm realm, MessageColumnInfo columnInfo, dev.octoshrimpy.quik.model.Message newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.Message) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_MessageRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_MessageRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addInteger(columnInfo.threadIdColKey, unmanagedSource.realmGet$threadId());
        builder.addInteger(columnInfo.contentIdColKey, unmanagedSource.realmGet$contentId());
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());
        builder.addInteger(columnInfo.boxIdColKey, unmanagedSource.realmGet$boxId());
        builder.addString(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addInteger(columnInfo.dateColKey, unmanagedSource.realmGet$date());
        builder.addInteger(columnInfo.dateSentColKey, unmanagedSource.realmGet$dateSent());
        builder.addBoolean(columnInfo.seenColKey, unmanagedSource.realmGet$seen());
        builder.addBoolean(columnInfo.readColKey, unmanagedSource.realmGet$read());
        builder.addBoolean(columnInfo.lockedColKey, unmanagedSource.realmGet$locked());
        builder.addInteger(columnInfo.subIdColKey, unmanagedSource.realmGet$subId());
        builder.addString(columnInfo.bodyColKey, unmanagedSource.realmGet$body());
        builder.addInteger(columnInfo.errorCodeColKey, unmanagedSource.realmGet$errorCode());
        builder.addInteger(columnInfo.deliveryStatusColKey, unmanagedSource.realmGet$deliveryStatus());
        builder.addString(columnInfo.attachmentTypeStringColKey, unmanagedSource.realmGet$attachmentTypeString());
        builder.addString(columnInfo.mmsDeliveryStatusStringColKey, unmanagedSource.realmGet$mmsDeliveryStatusString());
        builder.addString(columnInfo.readReportStringColKey, unmanagedSource.realmGet$readReportString());
        builder.addInteger(columnInfo.errorTypeColKey, unmanagedSource.realmGet$errorType());
        builder.addInteger(columnInfo.messageSizeColKey, unmanagedSource.realmGet$messageSize());
        builder.addInteger(columnInfo.messageTypeColKey, unmanagedSource.realmGet$messageType());
        builder.addInteger(columnInfo.mmsStatusColKey, unmanagedSource.realmGet$mmsStatus());
        builder.addString(columnInfo.subjectColKey, unmanagedSource.realmGet$subject());
        builder.addString(columnInfo.textContentTypeColKey, unmanagedSource.realmGet$textContentType());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<dev.octoshrimpy.quik.model.MmsPart> partsUnmanagedList = unmanagedSource.realmGet$parts();
        if (partsUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.MmsPart> partsManagedList = managedCopy.realmGet$parts();
            partsManagedList.clear();
            for (int i = 0; i < partsUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.MmsPart partsUnmanagedItem = partsUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.MmsPart cacheparts = (dev.octoshrimpy.quik.model.MmsPart) cache.get(partsUnmanagedItem);
                if (cacheparts != null) {
                    partsManagedList.add(cacheparts);
                } else {
                    partsManagedList.add(dev_octoshrimpy_quik_model_MmsPartRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_MmsPartRealmProxy.MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class), partsUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.threadIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.contentIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
        String realmGet$address = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.boxIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
        String realmGet$type = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateSentColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
        String realmGet$body = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
        String realmGet$attachmentTypeString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
        if (realmGet$attachmentTypeString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringColKey, objKey, realmGet$attachmentTypeString, false);
        }
        String realmGet$mmsDeliveryStatusString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
        if (realmGet$mmsDeliveryStatusString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringColKey, objKey, realmGet$mmsDeliveryStatusString, false);
        }
        String realmGet$readReportString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$readReportString();
        if (realmGet$readReportString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.readReportStringColKey, objKey, realmGet$readReportString, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
        String realmGet$subject = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
        }
        String realmGet$textContentType = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$textContentType();
        if (realmGet$textContentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeColKey, objKey, realmGet$textContentType, false);
        }

        RealmList<dev.octoshrimpy.quik.model.MmsPart> partsList = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$parts();
        if (partsList != null) {
            OsList partsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.partsColKey);
            for (dev.octoshrimpy.quik.model.MmsPart partsItem : partsList) {
                Long cacheItemIndexparts = cache.get(partsItem);
                if (cacheItemIndexparts == null) {
                    cacheItemIndexparts = dev_octoshrimpy_quik_model_MmsPartRealmProxy.insert(realm, partsItem, cache);
                }
                partsOsList.addRow(cacheItemIndexparts);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.Message object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.threadIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.contentIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
            String realmGet$address = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.boxIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
            String realmGet$type = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateSentColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
            String realmGet$body = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
            String realmGet$attachmentTypeString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
            if (realmGet$attachmentTypeString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringColKey, objKey, realmGet$attachmentTypeString, false);
            }
            String realmGet$mmsDeliveryStatusString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
            if (realmGet$mmsDeliveryStatusString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringColKey, objKey, realmGet$mmsDeliveryStatusString, false);
            }
            String realmGet$readReportString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$readReportString();
            if (realmGet$readReportString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.readReportStringColKey, objKey, realmGet$readReportString, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
            String realmGet$subject = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
            }
            String realmGet$textContentType = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$textContentType();
            if (realmGet$textContentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeColKey, objKey, realmGet$textContentType, false);
            }

            RealmList<dev.octoshrimpy.quik.model.MmsPart> partsList = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$parts();
            if (partsList != null) {
                OsList partsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.partsColKey);
                for (dev.octoshrimpy.quik.model.MmsPart partsItem : partsList) {
                    Long cacheItemIndexparts = cache.get(partsItem);
                    if (cacheItemIndexparts == null) {
                        cacheItemIndexparts = dev_octoshrimpy_quik_model_MmsPartRealmProxy.insert(realm, partsItem, cache);
                    }
                    partsOsList.addRow(cacheItemIndexparts);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.threadIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.contentIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
        String realmGet$address = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.boxIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
        String realmGet$type = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateSentColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
        String realmGet$body = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bodyColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
        String realmGet$attachmentTypeString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
        if (realmGet$attachmentTypeString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringColKey, objKey, realmGet$attachmentTypeString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.attachmentTypeStringColKey, objKey, false);
        }
        String realmGet$mmsDeliveryStatusString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
        if (realmGet$mmsDeliveryStatusString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringColKey, objKey, realmGet$mmsDeliveryStatusString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mmsDeliveryStatusStringColKey, objKey, false);
        }
        String realmGet$readReportString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$readReportString();
        if (realmGet$readReportString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.readReportStringColKey, objKey, realmGet$readReportString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.readReportStringColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
        String realmGet$subject = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.subjectColKey, objKey, false);
        }
        String realmGet$textContentType = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$textContentType();
        if (realmGet$textContentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeColKey, objKey, realmGet$textContentType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textContentTypeColKey, objKey, false);
        }

        OsList partsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.partsColKey);
        RealmList<dev.octoshrimpy.quik.model.MmsPart> partsList = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$parts();
        if (partsList != null && partsList.size() == partsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = partsList.size();
            for (int i = 0; i < objectCount; i++) {
                dev.octoshrimpy.quik.model.MmsPart partsItem = partsList.get(i);
                Long cacheItemIndexparts = cache.get(partsItem);
                if (cacheItemIndexparts == null) {
                    cacheItemIndexparts = dev_octoshrimpy_quik_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                }
                partsOsList.setRow(i, cacheItemIndexparts);
            }
        } else {
            partsOsList.removeAll();
            if (partsList != null) {
                for (dev.octoshrimpy.quik.model.MmsPart partsItem : partsList) {
                    Long cacheItemIndexparts = cache.get(partsItem);
                    if (cacheItemIndexparts == null) {
                        cacheItemIndexparts = dev_octoshrimpy_quik_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                    }
                    partsOsList.addRow(cacheItemIndexparts);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.Message object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.threadIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.contentIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
            String realmGet$address = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.boxIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
            String realmGet$type = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateSentColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
            String realmGet$body = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bodyColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
            String realmGet$attachmentTypeString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
            if (realmGet$attachmentTypeString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringColKey, objKey, realmGet$attachmentTypeString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.attachmentTypeStringColKey, objKey, false);
            }
            String realmGet$mmsDeliveryStatusString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
            if (realmGet$mmsDeliveryStatusString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringColKey, objKey, realmGet$mmsDeliveryStatusString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mmsDeliveryStatusStringColKey, objKey, false);
            }
            String realmGet$readReportString = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$readReportString();
            if (realmGet$readReportString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.readReportStringColKey, objKey, realmGet$readReportString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.readReportStringColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusColKey, objKey, ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
            String realmGet$subject = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.subjectColKey, objKey, false);
            }
            String realmGet$textContentType = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$textContentType();
            if (realmGet$textContentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeColKey, objKey, realmGet$textContentType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textContentTypeColKey, objKey, false);
            }

            OsList partsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.partsColKey);
            RealmList<dev.octoshrimpy.quik.model.MmsPart> partsList = ((dev_octoshrimpy_quik_model_MessageRealmProxyInterface) object).realmGet$parts();
            if (partsList != null && partsList.size() == partsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = partsList.size();
                for (int i = 0; i < objectCount; i++) {
                    dev.octoshrimpy.quik.model.MmsPart partsItem = partsList.get(i);
                    Long cacheItemIndexparts = cache.get(partsItem);
                    if (cacheItemIndexparts == null) {
                        cacheItemIndexparts = dev_octoshrimpy_quik_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                    }
                    partsOsList.setRow(i, cacheItemIndexparts);
                }
            } else {
                partsOsList.removeAll();
                if (partsList != null) {
                    for (dev.octoshrimpy.quik.model.MmsPart partsItem : partsList) {
                        Long cacheItemIndexparts = cache.get(partsItem);
                        if (cacheItemIndexparts == null) {
                            cacheItemIndexparts = dev_octoshrimpy_quik_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                        }
                        partsOsList.addRow(cacheItemIndexparts);
                    }
                }
            }

        }
    }

    public static dev.octoshrimpy.quik.model.Message createDetachedCopy(dev.octoshrimpy.quik.model.Message realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.Message unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.Message();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.Message) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.Message) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_MessageRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_MessageRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_MessageRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_MessageRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$threadId(realmSource.realmGet$threadId());
        unmanagedCopy.realmSet$contentId(realmSource.realmGet$contentId());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$boxId(realmSource.realmGet$boxId());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$dateSent(realmSource.realmGet$dateSent());
        unmanagedCopy.realmSet$seen(realmSource.realmGet$seen());
        unmanagedCopy.realmSet$read(realmSource.realmGet$read());
        unmanagedCopy.realmSet$locked(realmSource.realmGet$locked());
        unmanagedCopy.realmSet$subId(realmSource.realmGet$subId());
        unmanagedCopy.realmSet$body(realmSource.realmGet$body());
        unmanagedCopy.realmSet$errorCode(realmSource.realmGet$errorCode());
        unmanagedCopy.realmSet$deliveryStatus(realmSource.realmGet$deliveryStatus());
        unmanagedCopy.realmSet$attachmentTypeString(realmSource.realmGet$attachmentTypeString());
        unmanagedCopy.realmSet$mmsDeliveryStatusString(realmSource.realmGet$mmsDeliveryStatusString());
        unmanagedCopy.realmSet$readReportString(realmSource.realmGet$readReportString());
        unmanagedCopy.realmSet$errorType(realmSource.realmGet$errorType());
        unmanagedCopy.realmSet$messageSize(realmSource.realmGet$messageSize());
        unmanagedCopy.realmSet$messageType(realmSource.realmGet$messageType());
        unmanagedCopy.realmSet$mmsStatus(realmSource.realmGet$mmsStatus());
        unmanagedCopy.realmSet$subject(realmSource.realmGet$subject());
        unmanagedCopy.realmSet$textContentType(realmSource.realmGet$textContentType());

        // Deep copy of parts
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$parts(null);
        } else {
            RealmList<dev.octoshrimpy.quik.model.MmsPart> managedpartsList = realmSource.realmGet$parts();
            RealmList<dev.octoshrimpy.quik.model.MmsPart> unmanagedpartsList = new RealmList<dev.octoshrimpy.quik.model.MmsPart>();
            unmanagedCopy.realmSet$parts(unmanagedpartsList);
            int nextDepth = currentDepth + 1;
            int size = managedpartsList.size();
            for (int i = 0; i < size; i++) {
                dev.octoshrimpy.quik.model.MmsPart item = dev_octoshrimpy_quik_model_MmsPartRealmProxy.createDetachedCopy(managedpartsList.get(i), nextDepth, maxDepth, cache);
                unmanagedpartsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.Message update(Realm realm, MessageColumnInfo columnInfo, dev.octoshrimpy.quik.model.Message realmObject, dev.octoshrimpy.quik.model.Message newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_MessageRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_MessageRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_MessageRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_MessageRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Message.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.threadIdColKey, realmObjectSource.realmGet$threadId());
        builder.addInteger(columnInfo.contentIdColKey, realmObjectSource.realmGet$contentId());
        builder.addString(columnInfo.addressColKey, realmObjectSource.realmGet$address());
        builder.addInteger(columnInfo.boxIdColKey, realmObjectSource.realmGet$boxId());
        builder.addString(columnInfo.typeColKey, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.dateColKey, realmObjectSource.realmGet$date());
        builder.addInteger(columnInfo.dateSentColKey, realmObjectSource.realmGet$dateSent());
        builder.addBoolean(columnInfo.seenColKey, realmObjectSource.realmGet$seen());
        builder.addBoolean(columnInfo.readColKey, realmObjectSource.realmGet$read());
        builder.addBoolean(columnInfo.lockedColKey, realmObjectSource.realmGet$locked());
        builder.addInteger(columnInfo.subIdColKey, realmObjectSource.realmGet$subId());
        builder.addString(columnInfo.bodyColKey, realmObjectSource.realmGet$body());
        builder.addInteger(columnInfo.errorCodeColKey, realmObjectSource.realmGet$errorCode());
        builder.addInteger(columnInfo.deliveryStatusColKey, realmObjectSource.realmGet$deliveryStatus());
        builder.addString(columnInfo.attachmentTypeStringColKey, realmObjectSource.realmGet$attachmentTypeString());
        builder.addString(columnInfo.mmsDeliveryStatusStringColKey, realmObjectSource.realmGet$mmsDeliveryStatusString());
        builder.addString(columnInfo.readReportStringColKey, realmObjectSource.realmGet$readReportString());
        builder.addInteger(columnInfo.errorTypeColKey, realmObjectSource.realmGet$errorType());
        builder.addInteger(columnInfo.messageSizeColKey, realmObjectSource.realmGet$messageSize());
        builder.addInteger(columnInfo.messageTypeColKey, realmObjectSource.realmGet$messageType());
        builder.addInteger(columnInfo.mmsStatusColKey, realmObjectSource.realmGet$mmsStatus());
        builder.addString(columnInfo.subjectColKey, realmObjectSource.realmGet$subject());
        builder.addString(columnInfo.textContentTypeColKey, realmObjectSource.realmGet$textContentType());

        RealmList<dev.octoshrimpy.quik.model.MmsPart> partsUnmanagedList = realmObjectSource.realmGet$parts();
        if (partsUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.MmsPart> partsManagedCopy = new RealmList<dev.octoshrimpy.quik.model.MmsPart>();
            for (int i = 0; i < partsUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.MmsPart partsItem = partsUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.MmsPart cacheparts = (dev.octoshrimpy.quik.model.MmsPart) cache.get(partsItem);
                if (cacheparts != null) {
                    partsManagedCopy.add(cacheparts);
                } else {
                    partsManagedCopy.add(dev_octoshrimpy_quik_model_MmsPartRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_MmsPartRealmProxy.MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class), partsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.partsColKey, partsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.partsColKey, new RealmList<dev.octoshrimpy.quik.model.MmsPart>());
        }

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Message = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{threadId:");
        stringBuilder.append(realmGet$threadId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contentId:");
        stringBuilder.append(realmGet$contentId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{boxId:");
        stringBuilder.append(realmGet$boxId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dateSent:");
        stringBuilder.append(realmGet$dateSent());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{seen:");
        stringBuilder.append(realmGet$seen());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{read:");
        stringBuilder.append(realmGet$read());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{locked:");
        stringBuilder.append(realmGet$locked());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subId:");
        stringBuilder.append(realmGet$subId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{body:");
        stringBuilder.append(realmGet$body());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{errorCode:");
        stringBuilder.append(realmGet$errorCode());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deliveryStatus:");
        stringBuilder.append(realmGet$deliveryStatus());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachmentTypeString:");
        stringBuilder.append(realmGet$attachmentTypeString());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mmsDeliveryStatusString:");
        stringBuilder.append(realmGet$mmsDeliveryStatusString());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{readReportString:");
        stringBuilder.append(realmGet$readReportString());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{errorType:");
        stringBuilder.append(realmGet$errorType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{messageSize:");
        stringBuilder.append(realmGet$messageSize());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{messageType:");
        stringBuilder.append(realmGet$messageType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mmsStatus:");
        stringBuilder.append(realmGet$mmsStatus());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subject:");
        stringBuilder.append(realmGet$subject());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{textContentType:");
        stringBuilder.append(realmGet$textContentType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{parts:");
        stringBuilder.append("RealmList<MmsPart>[").append(realmGet$parts().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dev_octoshrimpy_quik_model_MessageRealmProxy aMessage = (dev_octoshrimpy_quik_model_MessageRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aMessage.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aMessage.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
