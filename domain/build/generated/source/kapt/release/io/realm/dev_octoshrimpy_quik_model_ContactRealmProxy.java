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
public class dev_octoshrimpy_quik_model_ContactRealmProxy extends dev.octoshrimpy.quik.model.Contact
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_ContactRealmProxyInterface {

    static final class ContactColumnInfo extends ColumnInfo {
        long lookupKeyColKey;
        long numbersColKey;
        long nameColKey;
        long photoUriColKey;
        long starredColKey;
        long lastUpdateColKey;

        ContactColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Contact");
            this.lookupKeyColKey = addColumnDetails("lookupKey", "lookupKey", objectSchemaInfo);
            this.numbersColKey = addColumnDetails("numbers", "numbers", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.photoUriColKey = addColumnDetails("photoUri", "photoUri", objectSchemaInfo);
            this.starredColKey = addColumnDetails("starred", "starred", objectSchemaInfo);
            this.lastUpdateColKey = addColumnDetails("lastUpdate", "lastUpdate", objectSchemaInfo);
        }

        ContactColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactColumnInfo src = (ContactColumnInfo) rawSrc;
            final ContactColumnInfo dst = (ContactColumnInfo) rawDst;
            dst.lookupKeyColKey = src.lookupKeyColKey;
            dst.numbersColKey = src.numbersColKey;
            dst.nameColKey = src.nameColKey;
            dst.photoUriColKey = src.photoUriColKey;
            dst.starredColKey = src.starredColKey;
            dst.lastUpdateColKey = src.lastUpdateColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ContactColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.Contact> proxyState;
    private RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersRealmList;

    dev_octoshrimpy_quik_model_ContactRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.Contact>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lookupKey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lookupKeyColKey);
    }

    @Override
    public void realmSet$lookupKey(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'lookupKey' cannot be changed after object was created.");
    }

    @Override
    public RealmList<dev.octoshrimpy.quik.model.PhoneNumber> realmGet$numbers() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (numbersRealmList != null) {
            return numbersRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.numbersColKey);
            numbersRealmList = new RealmList<dev.octoshrimpy.quik.model.PhoneNumber>(dev.octoshrimpy.quik.model.PhoneNumber.class, osList, proxyState.getRealm$realm());
            return numbersRealmList;
        }
    }

    @Override
    public void realmSet$numbers(RealmList<dev.octoshrimpy.quik.model.PhoneNumber> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("numbers")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<dev.octoshrimpy.quik.model.PhoneNumber> original = value;
                value = new RealmList<dev.octoshrimpy.quik.model.PhoneNumber>();
                for (dev.octoshrimpy.quik.model.PhoneNumber item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealmOrUpdate(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.numbersColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                dev.octoshrimpy.quik.model.PhoneNumber linkedObject = value.get(i);
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
                dev.octoshrimpy.quik.model.PhoneNumber linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
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
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoUri() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoUriColKey);
    }

    @Override
    public void realmSet$photoUri(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoUriColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoUriColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoUriColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoUriColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$starred() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.starredColKey);
    }

    @Override
    public void realmSet$starred(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.starredColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.starredColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Contact", false, 6, 0);
        builder.addPersistedProperty(NO_ALIAS, "lookupKey", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "numbers", RealmFieldType.LIST, "PhoneNumber");
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "photoUri", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "starred", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lastUpdate", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ContactColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Contact";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Contact";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.Contact createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        dev.octoshrimpy.quik.model.Contact obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
            ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class);
            long pkColumnKey = columnInfo.lookupKeyColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("lookupKey")) {
                objKey = table.findFirstString(pkColumnKey, json.getString("lookupKey"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("numbers")) {
                excludeFields.add("numbers");
            }
            if (json.has("lookupKey")) {
                if (json.isNull("lookupKey")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Contact.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Contact.class, json.getString("lookupKey"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'lookupKey'.");
            }
        }

        final dev_octoshrimpy_quik_model_ContactRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ContactRealmProxyInterface) obj;
        if (json.has("numbers")) {
            if (json.isNull("numbers")) {
                objProxy.realmSet$numbers(null);
            } else {
                objProxy.realmGet$numbers().clear();
                JSONArray array = json.getJSONArray("numbers");
                for (int i = 0; i < array.length(); i++) {
                    dev.octoshrimpy.quik.model.PhoneNumber item = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$numbers().add(item);
                }
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("photoUri")) {
            if (json.isNull("photoUri")) {
                objProxy.realmSet$photoUri(null);
            } else {
                objProxy.realmSet$photoUri((String) json.getString("photoUri"));
            }
        }
        if (json.has("starred")) {
            if (json.isNull("starred")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'starred' to null.");
            } else {
                objProxy.realmSet$starred((boolean) json.getBoolean("starred"));
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
    public static dev.octoshrimpy.quik.model.Contact createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.Contact obj = new dev.octoshrimpy.quik.model.Contact();
        final dev_octoshrimpy_quik_model_ContactRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ContactRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("lookupKey")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lookupKey((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lookupKey(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("numbers")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$numbers(null);
                } else {
                    objProxy.realmSet$numbers(new RealmList<dev.octoshrimpy.quik.model.PhoneNumber>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        dev.octoshrimpy.quik.model.PhoneNumber item = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$numbers().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("photoUri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoUri((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoUri(null);
                }
            } else if (name.equals("starred")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$starred((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'starred' to null.");
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'lookupKey'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static dev_octoshrimpy_quik_model_ContactRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.Contact copyOrUpdate(Realm realm, ContactColumnInfo columnInfo, dev.octoshrimpy.quik.model.Contact object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.Contact) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.Contact realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
            long pkColumnKey = columnInfo.lookupKeyColKey;
            long objKey = table.findFirstString(pkColumnKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lookupKey());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.Contact copy(Realm realm, ContactColumnInfo columnInfo, dev.octoshrimpy.quik.model.Contact newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.Contact) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_ContactRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_ContactRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.lookupKeyColKey, unmanagedSource.realmGet$lookupKey());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.photoUriColKey, unmanagedSource.realmGet$photoUri());
        builder.addBoolean(columnInfo.starredColKey, unmanagedSource.realmGet$starred());
        builder.addInteger(columnInfo.lastUpdateColKey, unmanagedSource.realmGet$lastUpdate());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersUnmanagedList = unmanagedSource.realmGet$numbers();
        if (numbersUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersManagedList = managedCopy.realmGet$numbers();
            numbersManagedList.clear();
            for (int i = 0; i < numbersUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.PhoneNumber numbersUnmanagedItem = numbersUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.PhoneNumber cachenumbers = (dev.octoshrimpy.quik.model.PhoneNumber) cache.get(numbersUnmanagedItem);
                if (cachenumbers != null) {
                    numbersManagedList.add(cachenumbers);
                } else {
                    numbersManagedList.add(dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.PhoneNumber.class), numbersUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class);
        long pkColumnKey = columnInfo.lookupKeyColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);

        RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersList = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$numbers();
        if (numbersList != null) {
            OsList numbersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.numbersColKey);
            for (dev.octoshrimpy.quik.model.PhoneNumber numbersItem : numbersList) {
                Long cacheItemIndexnumbers = cache.get(numbersItem);
                if (cacheItemIndexnumbers == null) {
                    cacheItemIndexnumbers = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insert(realm, numbersItem, cache);
                }
                numbersOsList.addRow(cacheItemIndexnumbers);
            }
        }
        String realmGet$name = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$photoUri = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$photoUri();
        if (realmGet$photoUri != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUriColKey, objKey, realmGet$photoUri, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.starredColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class);
        long pkColumnKey = columnInfo.lookupKeyColKey;
        dev.octoshrimpy.quik.model.Contact object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);

            RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersList = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$numbers();
            if (numbersList != null) {
                OsList numbersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.numbersColKey);
                for (dev.octoshrimpy.quik.model.PhoneNumber numbersItem : numbersList) {
                    Long cacheItemIndexnumbers = cache.get(numbersItem);
                    if (cacheItemIndexnumbers == null) {
                        cacheItemIndexnumbers = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insert(realm, numbersItem, cache);
                    }
                    numbersOsList.addRow(cacheItemIndexnumbers);
                }
            }
            String realmGet$name = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$photoUri = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$photoUri();
            if (realmGet$photoUri != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUriColKey, objKey, realmGet$photoUri, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.starredColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class);
        long pkColumnKey = columnInfo.lookupKeyColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);

        OsList numbersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.numbersColKey);
        RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersList = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$numbers();
        if (numbersList != null && numbersList.size() == numbersOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = numbersList.size();
            for (int i = 0; i < objectCount; i++) {
                dev.octoshrimpy.quik.model.PhoneNumber numbersItem = numbersList.get(i);
                Long cacheItemIndexnumbers = cache.get(numbersItem);
                if (cacheItemIndexnumbers == null) {
                    cacheItemIndexnumbers = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                }
                numbersOsList.setRow(i, cacheItemIndexnumbers);
            }
        } else {
            numbersOsList.removeAll();
            if (numbersList != null) {
                for (dev.octoshrimpy.quik.model.PhoneNumber numbersItem : numbersList) {
                    Long cacheItemIndexnumbers = cache.get(numbersItem);
                    if (cacheItemIndexnumbers == null) {
                        cacheItemIndexnumbers = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                    }
                    numbersOsList.addRow(cacheItemIndexnumbers);
                }
            }
        }

        String realmGet$name = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$photoUri = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$photoUri();
        if (realmGet$photoUri != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUriColKey, objKey, realmGet$photoUri, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUriColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.starredColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class);
        long pkColumnKey = columnInfo.lookupKeyColKey;
        dev.octoshrimpy.quik.model.Contact object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);

            OsList numbersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.numbersColKey);
            RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersList = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$numbers();
            if (numbersList != null && numbersList.size() == numbersOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = numbersList.size();
                for (int i = 0; i < objectCount; i++) {
                    dev.octoshrimpy.quik.model.PhoneNumber numbersItem = numbersList.get(i);
                    Long cacheItemIndexnumbers = cache.get(numbersItem);
                    if (cacheItemIndexnumbers == null) {
                        cacheItemIndexnumbers = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                    }
                    numbersOsList.setRow(i, cacheItemIndexnumbers);
                }
            } else {
                numbersOsList.removeAll();
                if (numbersList != null) {
                    for (dev.octoshrimpy.quik.model.PhoneNumber numbersItem : numbersList) {
                        Long cacheItemIndexnumbers = cache.get(numbersItem);
                        if (cacheItemIndexnumbers == null) {
                            cacheItemIndexnumbers = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                        }
                        numbersOsList.addRow(cacheItemIndexnumbers);
                    }
                }
            }

            String realmGet$name = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$photoUri = ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$photoUri();
            if (realmGet$photoUri != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUriColKey, objKey, realmGet$photoUri, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUriColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.starredColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateColKey, objKey, ((dev_octoshrimpy_quik_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static dev.octoshrimpy.quik.model.Contact createDetachedCopy(dev.octoshrimpy.quik.model.Contact realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.Contact unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.Contact();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.Contact) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.Contact) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_ContactRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_ContactRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_ContactRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_ContactRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$lookupKey(realmSource.realmGet$lookupKey());

        // Deep copy of numbers
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$numbers(null);
        } else {
            RealmList<dev.octoshrimpy.quik.model.PhoneNumber> managednumbersList = realmSource.realmGet$numbers();
            RealmList<dev.octoshrimpy.quik.model.PhoneNumber> unmanagednumbersList = new RealmList<dev.octoshrimpy.quik.model.PhoneNumber>();
            unmanagedCopy.realmSet$numbers(unmanagednumbersList);
            int nextDepth = currentDepth + 1;
            int size = managednumbersList.size();
            for (int i = 0; i < size; i++) {
                dev.octoshrimpy.quik.model.PhoneNumber item = dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.createDetachedCopy(managednumbersList.get(i), nextDepth, maxDepth, cache);
                unmanagednumbersList.add(item);
            }
        }
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$photoUri(realmSource.realmGet$photoUri());
        unmanagedCopy.realmSet$starred(realmSource.realmGet$starred());
        unmanagedCopy.realmSet$lastUpdate(realmSource.realmGet$lastUpdate());

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.Contact update(Realm realm, ContactColumnInfo columnInfo, dev.octoshrimpy.quik.model.Contact realmObject, dev.octoshrimpy.quik.model.Contact newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_ContactRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_ContactRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_ContactRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_ContactRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Contact.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.lookupKeyColKey, realmObjectSource.realmGet$lookupKey());

        RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersUnmanagedList = realmObjectSource.realmGet$numbers();
        if (numbersUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.PhoneNumber> numbersManagedCopy = new RealmList<dev.octoshrimpy.quik.model.PhoneNumber>();
            for (int i = 0; i < numbersUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.PhoneNumber numbersItem = numbersUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.PhoneNumber cachenumbers = (dev.octoshrimpy.quik.model.PhoneNumber) cache.get(numbersItem);
                if (cachenumbers != null) {
                    numbersManagedCopy.add(cachenumbers);
                } else {
                    numbersManagedCopy.add(dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.PhoneNumber.class), numbersItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.numbersColKey, numbersManagedCopy);
        } else {
            builder.addObjectList(columnInfo.numbersColKey, new RealmList<dev.octoshrimpy.quik.model.PhoneNumber>());
        }
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.photoUriColKey, realmObjectSource.realmGet$photoUri());
        builder.addBoolean(columnInfo.starredColKey, realmObjectSource.realmGet$starred());
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
        StringBuilder stringBuilder = new StringBuilder("Contact = proxy[");
        stringBuilder.append("{lookupKey:");
        stringBuilder.append(realmGet$lookupKey());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numbers:");
        stringBuilder.append("RealmList<PhoneNumber>[").append(realmGet$numbers().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoUri:");
        stringBuilder.append(realmGet$photoUri() != null ? realmGet$photoUri() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{starred:");
        stringBuilder.append(realmGet$starred());
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
        dev_octoshrimpy_quik_model_ContactRealmProxy aContact = (dev_octoshrimpy_quik_model_ContactRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aContact.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContact.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aContact.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
