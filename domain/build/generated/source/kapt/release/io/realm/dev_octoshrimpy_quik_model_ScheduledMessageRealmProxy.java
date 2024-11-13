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
public class dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy extends dev.octoshrimpy.quik.model.ScheduledMessage
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface {

    static final class ScheduledMessageColumnInfo extends ColumnInfo {
        long idColKey;
        long dateColKey;
        long subIdColKey;
        long recipientsColKey;
        long sendAsGroupColKey;
        long bodyColKey;
        long attachmentsColKey;

        ScheduledMessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ScheduledMessage");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.dateColKey = addColumnDetails("date", "date", objectSchemaInfo);
            this.subIdColKey = addColumnDetails("subId", "subId", objectSchemaInfo);
            this.recipientsColKey = addColumnDetails("recipients", "recipients", objectSchemaInfo);
            this.sendAsGroupColKey = addColumnDetails("sendAsGroup", "sendAsGroup", objectSchemaInfo);
            this.bodyColKey = addColumnDetails("body", "body", objectSchemaInfo);
            this.attachmentsColKey = addColumnDetails("attachments", "attachments", objectSchemaInfo);
        }

        ScheduledMessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ScheduledMessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ScheduledMessageColumnInfo src = (ScheduledMessageColumnInfo) rawSrc;
            final ScheduledMessageColumnInfo dst = (ScheduledMessageColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.dateColKey = src.dateColKey;
            dst.subIdColKey = src.subIdColKey;
            dst.recipientsColKey = src.recipientsColKey;
            dst.sendAsGroupColKey = src.sendAsGroupColKey;
            dst.bodyColKey = src.bodyColKey;
            dst.attachmentsColKey = src.attachmentsColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ScheduledMessageColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.ScheduledMessage> proxyState;
    private RealmList<String> recipientsRealmList;
    private RealmList<String> attachmentsRealmList;

    dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ScheduledMessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.ScheduledMessage>(this);
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
    public RealmList<String> realmGet$recipients() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (recipientsRealmList != null) {
            return recipientsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.recipientsColKey, RealmFieldType.STRING_LIST);
            recipientsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return recipientsRealmList;
        }
    }

    @Override
    public void realmSet$recipients(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("recipients")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.recipientsColKey, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$sendAsGroup() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.sendAsGroupColKey);
    }

    @Override
    public void realmSet$sendAsGroup(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.sendAsGroupColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.sendAsGroupColKey, value);
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
    public RealmList<String> realmGet$attachments() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (attachmentsRealmList != null) {
            return attachmentsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.attachmentsColKey, RealmFieldType.STRING_LIST);
            attachmentsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return attachmentsRealmList;
        }
    }

    @Override
    public void realmSet$attachments(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("attachments")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.attachmentsColKey, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "ScheduledMessage", false, 7, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "subId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty(NO_ALIAS, "recipients", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "sendAsGroup", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "body", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty(NO_ALIAS, "attachments", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ScheduledMessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ScheduledMessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ScheduledMessage";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ScheduledMessage";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.ScheduledMessage createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        dev.octoshrimpy.quik.model.ScheduledMessage obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
            ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("recipients")) {
                excludeFields.add("recipients");
            }
            if (json.has("attachments")) {
                excludeFields.add("attachments");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.ScheduledMessage.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.ScheduledMessage.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) obj;
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        if (json.has("subId")) {
            if (json.isNull("subId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
            } else {
                objProxy.realmSet$subId((int) json.getInt("subId"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(realm, objProxy.realmGet$recipients(), json, "recipients", update);
        if (json.has("sendAsGroup")) {
            if (json.isNull("sendAsGroup")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sendAsGroup' to null.");
            } else {
                objProxy.realmSet$sendAsGroup((boolean) json.getBoolean("sendAsGroup"));
            }
        }
        if (json.has("body")) {
            if (json.isNull("body")) {
                objProxy.realmSet$body(null);
            } else {
                objProxy.realmSet$body((String) json.getString("body"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(realm, objProxy.realmGet$attachments(), json, "attachments", update);
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.ScheduledMessage createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.ScheduledMessage obj = new dev.octoshrimpy.quik.model.ScheduledMessage();
        final dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) obj;
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
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else if (name.equals("subId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
                }
            } else if (name.equals("recipients")) {
                objProxy.realmSet$recipients(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else if (name.equals("sendAsGroup")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sendAsGroup((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sendAsGroup' to null.");
                }
            } else if (name.equals("body")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$body((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$body(null);
                }
            } else if (name.equals("attachments")) {
                objProxy.realmSet$attachments(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
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

    static dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.ScheduledMessage copyOrUpdate(Realm realm, ScheduledMessageColumnInfo columnInfo, dev.octoshrimpy.quik.model.ScheduledMessage object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.ScheduledMessage) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.ScheduledMessage realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.ScheduledMessage copy(Realm realm, ScheduledMessageColumnInfo columnInfo, dev.octoshrimpy.quik.model.ScheduledMessage newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.ScheduledMessage) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addInteger(columnInfo.dateColKey, unmanagedSource.realmGet$date());
        builder.addInteger(columnInfo.subIdColKey, unmanagedSource.realmGet$subId());
        builder.addStringList(columnInfo.recipientsColKey, unmanagedSource.realmGet$recipients());
        builder.addBoolean(columnInfo.sendAsGroupColKey, unmanagedSource.realmGet$sendAsGroup());
        builder.addString(columnInfo.bodyColKey, unmanagedSource.realmGet$body());
        builder.addStringList(columnInfo.attachmentsColKey, unmanagedSource.realmGet$attachments());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.ScheduledMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

        RealmList<java.lang.String> recipientsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null) {
            OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
            for (java.lang.String recipientsItem : recipientsList) {
                if (recipientsItem == null) {
                    recipientsOsList.addNull();
                } else {
                    recipientsOsList.addString(recipientsItem);
                }
            }
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
        String realmGet$body = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
        }

        RealmList<java.lang.String> attachmentsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            OsList attachmentsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.attachmentsColKey);
            for (java.lang.String attachmentsItem : attachmentsList) {
                if (attachmentsItem == null) {
                    attachmentsOsList.addNull();
                } else {
                    attachmentsOsList.addString(attachmentsItem);
                }
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.ScheduledMessage object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.ScheduledMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

            RealmList<java.lang.String> recipientsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null) {
                OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
                for (java.lang.String recipientsItem : recipientsList) {
                    if (recipientsItem == null) {
                        recipientsOsList.addNull();
                    } else {
                        recipientsOsList.addString(recipientsItem);
                    }
                }
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
            String realmGet$body = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
            }

            RealmList<java.lang.String> attachmentsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                OsList attachmentsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.attachmentsColKey);
                for (java.lang.String attachmentsItem : attachmentsList) {
                    if (attachmentsItem == null) {
                        attachmentsOsList.addNull();
                    } else {
                        attachmentsOsList.addString(attachmentsItem);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.ScheduledMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

        OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
        recipientsOsList.removeAll();
        RealmList<java.lang.String> recipientsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null) {
            for (java.lang.String recipientsItem : recipientsList) {
                if (recipientsItem == null) {
                    recipientsOsList.addNull();
                } else {
                    recipientsOsList.addString(recipientsItem);
                }
            }
        }

        Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
        String realmGet$body = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bodyColKey, objKey, false);
        }

        OsList attachmentsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.attachmentsColKey);
        attachmentsOsList.removeAll();
        RealmList<java.lang.String> attachmentsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            for (java.lang.String attachmentsItem : attachmentsList) {
                if (attachmentsItem == null) {
                    attachmentsOsList.addNull();
                } else {
                    attachmentsOsList.addString(attachmentsItem);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.ScheduledMessage object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.ScheduledMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

            OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
            recipientsOsList.removeAll();
            RealmList<java.lang.String> recipientsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null) {
                for (java.lang.String recipientsItem : recipientsList) {
                    if (recipientsItem == null) {
                        recipientsOsList.addNull();
                    } else {
                        recipientsOsList.addString(recipientsItem);
                    }
                }
            }

            Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupColKey, objKey, ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
            String realmGet$body = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyColKey, objKey, realmGet$body, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bodyColKey, objKey, false);
            }

            OsList attachmentsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.attachmentsColKey);
            attachmentsOsList.removeAll();
            RealmList<java.lang.String> attachmentsList = ((dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                for (java.lang.String attachmentsItem : attachmentsList) {
                    if (attachmentsItem == null) {
                        attachmentsOsList.addNull();
                    } else {
                        attachmentsOsList.addString(attachmentsItem);
                    }
                }
            }

        }
    }

    public static dev.octoshrimpy.quik.model.ScheduledMessage createDetachedCopy(dev.octoshrimpy.quik.model.ScheduledMessage realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.ScheduledMessage unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.ScheduledMessage();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.ScheduledMessage) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.ScheduledMessage) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$subId(realmSource.realmGet$subId());

        unmanagedCopy.realmSet$recipients(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$recipients().addAll(realmSource.realmGet$recipients());
        unmanagedCopy.realmSet$sendAsGroup(realmSource.realmGet$sendAsGroup());
        unmanagedCopy.realmSet$body(realmSource.realmGet$body());

        unmanagedCopy.realmSet$attachments(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$attachments().addAll(realmSource.realmGet$attachments());

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.ScheduledMessage update(Realm realm, ScheduledMessageColumnInfo columnInfo, dev.octoshrimpy.quik.model.ScheduledMessage realmObject, dev.octoshrimpy.quik.model.ScheduledMessage newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.dateColKey, realmObjectSource.realmGet$date());
        builder.addInteger(columnInfo.subIdColKey, realmObjectSource.realmGet$subId());
        builder.addStringList(columnInfo.recipientsColKey, realmObjectSource.realmGet$recipients());
        builder.addBoolean(columnInfo.sendAsGroupColKey, realmObjectSource.realmGet$sendAsGroup());
        builder.addString(columnInfo.bodyColKey, realmObjectSource.realmGet$body());
        builder.addStringList(columnInfo.attachmentsColKey, realmObjectSource.realmGet$attachments());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ScheduledMessage = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subId:");
        stringBuilder.append(realmGet$subId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipients:");
        stringBuilder.append("RealmList<String>[").append(realmGet$recipients().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sendAsGroup:");
        stringBuilder.append(realmGet$sendAsGroup());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{body:");
        stringBuilder.append(realmGet$body());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachments:");
        stringBuilder.append("RealmList<String>[").append(realmGet$attachments().size()).append("]");
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
        dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy aScheduledMessage = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aScheduledMessage.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aScheduledMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aScheduledMessage.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
