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
public class dev_octoshrimpy_quik_model_BlockedNumberRealmProxy extends dev.octoshrimpy.quik.model.BlockedNumber
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface {

    static final class BlockedNumberColumnInfo extends ColumnInfo {
        long idColKey;
        long addressColKey;

        BlockedNumberColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BlockedNumber");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
        }

        BlockedNumberColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BlockedNumberColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BlockedNumberColumnInfo src = (BlockedNumberColumnInfo) rawSrc;
            final BlockedNumberColumnInfo dst = (BlockedNumberColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.addressColKey = src.addressColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private BlockedNumberColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.BlockedNumber> proxyState;

    dev_octoshrimpy_quik_model_BlockedNumberRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BlockedNumberColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.BlockedNumber>(this);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "BlockedNumber", false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BlockedNumberColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BlockedNumberColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BlockedNumber";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BlockedNumber";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.BlockedNumber createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        dev.octoshrimpy.quik.model.BlockedNumber obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
            BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.BlockedNumber.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.BlockedNumber.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) obj;
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.BlockedNumber createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.BlockedNumber obj = new dev.octoshrimpy.quik.model.BlockedNumber();
        final dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) obj;
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
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
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

    static dev_octoshrimpy_quik_model_BlockedNumberRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.BlockedNumber copyOrUpdate(Realm realm, BlockedNumberColumnInfo columnInfo, dev.octoshrimpy.quik.model.BlockedNumber object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.BlockedNumber) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.BlockedNumber realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.BlockedNumber copy(Realm realm, BlockedNumberColumnInfo columnInfo, dev.octoshrimpy.quik.model.BlockedNumber newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.BlockedNumber) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.BlockedNumber object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$address = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.BlockedNumber object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.BlockedNumber) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$address = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.BlockedNumber object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        String realmGet$address = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.BlockedNumber object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.BlockedNumber) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            String realmGet$address = ((dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
            }
        }
    }

    public static dev.octoshrimpy.quik.model.BlockedNumber createDetachedCopy(dev.octoshrimpy.quik.model.BlockedNumber realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.BlockedNumber unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.BlockedNumber();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.BlockedNumber) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.BlockedNumber) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.BlockedNumber update(Realm realm, BlockedNumberColumnInfo columnInfo, dev.octoshrimpy.quik.model.BlockedNumber realmObject, dev.octoshrimpy.quik.model.BlockedNumber newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.BlockedNumber.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.addressColKey, realmObjectSource.realmGet$address());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("BlockedNumber = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address());
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
        dev_octoshrimpy_quik_model_BlockedNumberRealmProxy aBlockedNumber = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aBlockedNumber.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlockedNumber.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aBlockedNumber.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
