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
public class dev_octoshrimpy_quik_model_RecipientRealmProxy extends dev.octoshrimpy.quik.model.Recipient
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_RecipientRealmProxyInterface {

    static final class RecipientColumnInfo extends ColumnInfo {
        long idColKey;
        long addressColKey;
        long contactColKey;
        long lastUpdateColKey;

        RecipientColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Recipient");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
            this.contactColKey = addColumnDetails("contact", "contact", objectSchemaInfo);
            this.lastUpdateColKey = addColumnDetails("lastUpdate", "lastUpdate", objectSchemaInfo);
        }

        RecipientColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RecipientColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RecipientColumnInfo src = (RecipientColumnInfo) rawSrc;
            final RecipientColumnInfo dst = (RecipientColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.addressColKey = src.addressColKey;
            dst.contactColKey = src.contactColKey;
            dst.lastUpdateColKey = src.lastUpdateColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RecipientColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.Recipient> proxyState;

    dev_octoshrimpy_quik_model_RecipientRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RecipientColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.Recipient>(this);
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

    @Override
    public dev.octoshrimpy.quik.model.Contact realmGet$contact() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.contactColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(dev.octoshrimpy.quik.model.Contact.class, proxyState.getRow$realm().getLink(columnInfo.contactColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$contact(dev.octoshrimpy.quik.model.Contact value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("contact")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealmOrUpdate(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.contactColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.contactColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.contactColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.contactColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastUpdate() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastUpdateColKey);
    }

    @Override
    public void realmSet$lastUpdate(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastUpdateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastUpdateColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Recipient", false, 4, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "contact", RealmFieldType.OBJECT, "Contact");
        builder.addPersistedProperty(NO_ALIAS, "lastUpdate", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RecipientColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RecipientColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Recipient";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Recipient";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.Recipient createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        dev.octoshrimpy.quik.model.Recipient obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
            RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("contact")) {
                excludeFields.add("contact");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Recipient.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Recipient.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final dev_octoshrimpy_quik_model_RecipientRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) obj;
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("contact")) {
            if (json.isNull("contact")) {
                objProxy.realmSet$contact(null);
            } else {
                dev.octoshrimpy.quik.model.Contact contactObj = dev_octoshrimpy_quik_model_ContactRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("contact"), update);
                objProxy.realmSet$contact(contactObj);
            }
        }
        if (json.has("lastUpdate")) {
            if (json.isNull("lastUpdate")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastUpdate' to null.");
            } else {
                objProxy.realmSet$lastUpdate((long) json.getLong("lastUpdate"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.Recipient createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.Recipient obj = new dev.octoshrimpy.quik.model.Recipient();
        final dev_octoshrimpy_quik_model_RecipientRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) obj;
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
            } else if (name.equals("contact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$contact(null);
                } else {
                    dev.octoshrimpy.quik.model.Contact contactObj = dev_octoshrimpy_quik_model_ContactRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$contact(contactObj);
                }
            } else if (name.equals("lastUpdate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastUpdate((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastUpdate' to null.");
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

    static dev_octoshrimpy_quik_model_RecipientRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.Recipient copyOrUpdate(Realm realm, RecipientColumnInfo columnInfo, dev.octoshrimpy.quik.model.Recipient object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.Recipient) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.Recipient realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.Recipient copy(Realm realm, RecipientColumnInfo columnInfo, dev.octoshrimpy.quik.model.Recipient newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.Recipient) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_RecipientRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());
        builder.addInteger(columnInfo.lastUpdateColKey, unmanagedSource.realmGet$lastUpdate());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        dev.octoshrimpy.quik.model.Contact contactObj = unmanagedSource.realmGet$contact();
        if (contactObj == null) {
            managedCopy.realmSet$contact(null);
        } else {
            dev.octoshrimpy.quik.model.Contact cachecontact = (dev.octoshrimpy.quik.model.Contact) cache.get(contactObj);
            if (cachecontact != null) {
                managedCopy.realmSet$contact(cachecontact);
            } else {
                managedCopy.realmSet$contact(dev_octoshrimpy_quik_model_ContactRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class), contactObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.Recipient object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$address = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        }

        dev.octoshrimpy.quik.model.Contact contactObj = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = dev_octoshrimpy_quik_model_ContactRealmProxy.insert(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.Recipient object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Recipient) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$address = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            }

            dev.octoshrimpy.quik.model.Contact contactObj = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = dev_octoshrimpy_quik_model_ContactRealmProxy.insert(realm, contactObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.Recipient object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        String realmGet$address = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
        }

        dev.octoshrimpy.quik.model.Contact contactObj = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.contactColKey, objKey);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.Recipient object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Recipient) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            String realmGet$address = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
            }

            dev.octoshrimpy.quik.model.Contact contactObj = ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.contactColKey, objKey);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static dev.octoshrimpy.quik.model.Recipient createDetachedCopy(dev.octoshrimpy.quik.model.Recipient realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.Recipient unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.Recipient();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.Recipient) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.Recipient) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_RecipientRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_RecipientRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());

        // Deep copy of contact
        unmanagedCopy.realmSet$contact(dev_octoshrimpy_quik_model_ContactRealmProxy.createDetachedCopy(realmSource.realmGet$contact(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$lastUpdate(realmSource.realmGet$lastUpdate());

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.Recipient update(Realm realm, RecipientColumnInfo columnInfo, dev.octoshrimpy.quik.model.Recipient realmObject, dev.octoshrimpy.quik.model.Recipient newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_RecipientRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_RecipientRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_RecipientRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Recipient.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.addressColKey, realmObjectSource.realmGet$address());

        dev.octoshrimpy.quik.model.Contact contactObj = realmObjectSource.realmGet$contact();
        if (contactObj == null) {
            builder.addNull(columnInfo.contactColKey);
        } else {
            dev.octoshrimpy.quik.model.Contact cachecontact = (dev.octoshrimpy.quik.model.Contact) cache.get(contactObj);
            if (cachecontact != null) {
                builder.addObject(columnInfo.contactColKey, cachecontact);
            } else {
                builder.addObject(columnInfo.contactColKey, dev_octoshrimpy_quik_model_ContactRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class), contactObj, true, cache, flags));
            }
        }
        builder.addInteger(columnInfo.lastUpdateColKey, realmObjectSource.realmGet$lastUpdate());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Recipient = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contact:");
        stringBuilder.append(realmGet$contact() != null ? "Contact" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastUpdate:");
        stringBuilder.append(realmGet$lastUpdate());
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
        dev_octoshrimpy_quik_model_RecipientRealmProxy aRecipient = (dev_octoshrimpy_quik_model_RecipientRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRecipient.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRecipient.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRecipient.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
