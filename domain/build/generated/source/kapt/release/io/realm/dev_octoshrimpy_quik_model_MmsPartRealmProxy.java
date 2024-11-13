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
import io.realm.internal.UncheckedRow;
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
public class dev_octoshrimpy_quik_model_MmsPartRealmProxy extends dev.octoshrimpy.quik.model.MmsPart
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface {

    static final class MmsPartColumnInfo extends ColumnInfo {
        long idColKey;
        long messageIdColKey;
        long typeColKey;
        long seqColKey;
        long nameColKey;
        long textColKey;

        MmsPartColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MmsPart");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.messageIdColKey = addColumnDetails("messageId", "messageId", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.seqColKey = addColumnDetails("seq", "seq", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.textColKey = addColumnDetails("text", "text", objectSchemaInfo);
            addBacklinkDetails(schemaInfo, "messages", "Message", "parts");
        }

        MmsPartColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MmsPartColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MmsPartColumnInfo src = (MmsPartColumnInfo) rawSrc;
            final MmsPartColumnInfo dst = (MmsPartColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.messageIdColKey = src.messageIdColKey;
            dst.typeColKey = src.typeColKey;
            dst.seqColKey = src.seqColKey;
            dst.nameColKey = src.nameColKey;
            dst.textColKey = src.textColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MmsPartColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.MmsPart> proxyState;
    private RealmResults<dev.octoshrimpy.quik.model.Message> messagesBacklinks;

    dev_octoshrimpy_quik_model_MmsPartRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MmsPartColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.MmsPart>(this);
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
    public long realmGet$messageId() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.messageIdColKey);
    }

    @Override
    public void realmSet$messageId(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.messageIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.messageIdColKey, value);
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
    public int realmGet$seq() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.seqColKey);
    }

    @Override
    public void realmSet$seq(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.seqColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.seqColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$text() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.textColKey);
    }

    @Override
    public void realmSet$text(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.textColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.textColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.textColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.textColKey, value);
    }

    @Override
    public RealmResults<dev.octoshrimpy.quik.model.Message> realmGet$messages() {
        BaseRealm realm = proxyState.getRealm$realm();
        realm.checkIfValid();
        proxyState.getRow$realm().checkIfAttached();
        if (messagesBacklinks == null) {
            messagesBacklinks = RealmResults.createBacklinkResults(realm, proxyState.getRow$realm(), dev.octoshrimpy.quik.model.Message.class, "parts");
        }
        return messagesBacklinks;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "MmsPart", false, 6, 1);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "messageId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "seq", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "text", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addComputedLinkProperty("messages", "Message", "parts");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MmsPartColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MmsPartColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MmsPart";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MmsPart";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.MmsPart createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        dev.octoshrimpy.quik.model.MmsPart obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
            MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.MmsPart.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.MmsPart.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) obj;
        if (json.has("messageId")) {
            if (json.isNull("messageId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'messageId' to null.");
            } else {
                objProxy.realmSet$messageId((long) json.getLong("messageId"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("seq")) {
            if (json.isNull("seq")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seq' to null.");
            } else {
                objProxy.realmSet$seq((int) json.getInt("seq"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("text")) {
            if (json.isNull("text")) {
                objProxy.realmSet$text(null);
            } else {
                objProxy.realmSet$text((String) json.getString("text"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.MmsPart createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.MmsPart obj = new dev.octoshrimpy.quik.model.MmsPart();
        final dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) obj;
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
            } else if (name.equals("messageId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$messageId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'messageId' to null.");
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("seq")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seq((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seq' to null.");
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("text")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$text((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$text(null);
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

    static dev_octoshrimpy_quik_model_MmsPartRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.MmsPart copyOrUpdate(Realm realm, MmsPartColumnInfo columnInfo, dev.octoshrimpy.quik.model.MmsPart object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.MmsPart) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.MmsPart realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.MmsPart copy(Realm realm, MmsPartColumnInfo columnInfo, dev.octoshrimpy.quik.model.MmsPart newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.MmsPart) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addInteger(columnInfo.messageIdColKey, unmanagedSource.realmGet$messageId());
        builder.addString(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addInteger(columnInfo.seqColKey, unmanagedSource.realmGet$seq());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.textColKey, unmanagedSource.realmGet$text());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.MmsPart object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageIdColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$messageId(), false);
        String realmGet$type = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.seqColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
        String realmGet$name = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$text = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textColKey, objKey, realmGet$text, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.MmsPart object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.MmsPart) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageIdColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$messageId(), false);
            String realmGet$type = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.seqColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
            String realmGet$name = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$text = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textColKey, objKey, realmGet$text, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.MmsPart object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageIdColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$messageId(), false);
        String realmGet$type = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.seqColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
        String realmGet$name = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$text = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textColKey, objKey, realmGet$text, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.MmsPart object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.MmsPart) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageIdColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$messageId(), false);
            String realmGet$type = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.seqColKey, objKey, ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
            String realmGet$name = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$text = ((dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textColKey, objKey, realmGet$text, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textColKey, objKey, false);
            }
        }
    }

    public static dev.octoshrimpy.quik.model.MmsPart createDetachedCopy(dev.octoshrimpy.quik.model.MmsPart realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.MmsPart unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.MmsPart();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.MmsPart) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.MmsPart) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$messageId(realmSource.realmGet$messageId());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$seq(realmSource.realmGet$seq());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$text(realmSource.realmGet$text());

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.MmsPart update(Realm realm, MmsPartColumnInfo columnInfo, dev.octoshrimpy.quik.model.MmsPart realmObject, dev.octoshrimpy.quik.model.MmsPart newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_MmsPartRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.MmsPart.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.messageIdColKey, realmObjectSource.realmGet$messageId());
        builder.addString(columnInfo.typeColKey, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.seqColKey, realmObjectSource.realmGet$seq());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.textColKey, realmObjectSource.realmGet$text());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MmsPart = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{messageId:");
        stringBuilder.append(realmGet$messageId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{seq:");
        stringBuilder.append(realmGet$seq());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{text:");
        stringBuilder.append(realmGet$text() != null ? realmGet$text() : "null");
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
        dev_octoshrimpy_quik_model_MmsPartRealmProxy aMmsPart = (dev_octoshrimpy_quik_model_MmsPartRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aMmsPart.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMmsPart.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aMmsPart.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
