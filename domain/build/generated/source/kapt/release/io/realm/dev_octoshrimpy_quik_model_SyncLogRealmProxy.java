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
public class dev_octoshrimpy_quik_model_SyncLogRealmProxy extends dev.octoshrimpy.quik.model.SyncLog
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface {

    static final class SyncLogColumnInfo extends ColumnInfo {
        long dateColKey;

        SyncLogColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SyncLog");
            this.dateColKey = addColumnDetails("date", "date", objectSchemaInfo);
        }

        SyncLogColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SyncLogColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SyncLogColumnInfo src = (SyncLogColumnInfo) rawSrc;
            final SyncLogColumnInfo dst = (SyncLogColumnInfo) rawDst;
            dst.dateColKey = src.dateColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SyncLogColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.SyncLog> proxyState;

    dev_octoshrimpy_quik_model_SyncLogRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SyncLogColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.SyncLog>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "SyncLog", false, 1, 0);
        builder.addPersistedProperty(NO_ALIAS, "date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SyncLogColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SyncLogColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SyncLog";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SyncLog";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.SyncLog createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        dev.octoshrimpy.quik.model.SyncLog obj = realm.createObjectInternal(dev.octoshrimpy.quik.model.SyncLog.class, true, excludeFields);

        final dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) obj;
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.SyncLog createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final dev.octoshrimpy.quik.model.SyncLog obj = new dev.octoshrimpy.quik.model.SyncLog();
        final dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static dev_octoshrimpy_quik_model_SyncLogRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.SyncLog.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.SyncLog copyOrUpdate(Realm realm, SyncLogColumnInfo columnInfo, dev.octoshrimpy.quik.model.SyncLog object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.SyncLog) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.SyncLog copy(Realm realm, SyncLogColumnInfo columnInfo, dev.octoshrimpy.quik.model.SyncLog newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.SyncLog) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.SyncLog.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.dateColKey, unmanagedSource.realmGet$date());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.SyncLog object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.SyncLog.class);
        long tableNativePtr = table.getNativePtr();
        SyncLogColumnInfo columnInfo = (SyncLogColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.SyncLog.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) object).realmGet$date(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.SyncLog.class);
        long tableNativePtr = table.getNativePtr();
        SyncLogColumnInfo columnInfo = (SyncLogColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.SyncLog.class);
        dev.octoshrimpy.quik.model.SyncLog object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.SyncLog) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) object).realmGet$date(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.SyncLog object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.SyncLog.class);
        long tableNativePtr = table.getNativePtr();
        SyncLogColumnInfo columnInfo = (SyncLogColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.SyncLog.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) object).realmGet$date(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.SyncLog.class);
        long tableNativePtr = table.getNativePtr();
        SyncLogColumnInfo columnInfo = (SyncLogColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.SyncLog.class);
        dev.octoshrimpy.quik.model.SyncLog object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.SyncLog) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateColKey, objKey, ((dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) object).realmGet$date(), false);
        }
    }

    public static dev.octoshrimpy.quik.model.SyncLog createDetachedCopy(dev.octoshrimpy.quik.model.SyncLog realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.SyncLog unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.SyncLog();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.SyncLog) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.SyncLog) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_SyncLogRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SyncLog = proxy[");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
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
        dev_octoshrimpy_quik_model_SyncLogRealmProxy aSyncLog = (dev_octoshrimpy_quik_model_SyncLogRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aSyncLog.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSyncLog.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aSyncLog.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
