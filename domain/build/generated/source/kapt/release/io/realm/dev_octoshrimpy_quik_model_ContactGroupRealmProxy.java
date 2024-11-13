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
public class dev_octoshrimpy_quik_model_ContactGroupRealmProxy extends dev.octoshrimpy.quik.model.ContactGroup
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface {

    static final class ContactGroupColumnInfo extends ColumnInfo {
        long idColKey;
        long titleColKey;
        long contactsColKey;

        ContactGroupColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ContactGroup");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleColKey = addColumnDetails("title", "title", objectSchemaInfo);
            this.contactsColKey = addColumnDetails("contacts", "contacts", objectSchemaInfo);
        }

        ContactGroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactGroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactGroupColumnInfo src = (ContactGroupColumnInfo) rawSrc;
            final ContactGroupColumnInfo dst = (ContactGroupColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.titleColKey = src.titleColKey;
            dst.contactsColKey = src.contactsColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ContactGroupColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.ContactGroup> proxyState;
    private RealmList<dev.octoshrimpy.quik.model.Contact> contactsRealmList;

    dev_octoshrimpy_quik_model_ContactGroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactGroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.ContactGroup>(this);
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
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleColKey);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
            }
            row.getTable().setString(columnInfo.titleColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.titleColKey, value);
    }

    @Override
    public RealmList<dev.octoshrimpy.quik.model.Contact> realmGet$contacts() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (contactsRealmList != null) {
            return contactsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.contactsColKey);
            contactsRealmList = new RealmList<dev.octoshrimpy.quik.model.Contact>(dev.octoshrimpy.quik.model.Contact.class, osList, proxyState.getRealm$realm());
            return contactsRealmList;
        }
    }

    @Override
    public void realmSet$contacts(RealmList<dev.octoshrimpy.quik.model.Contact> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("contacts")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<dev.octoshrimpy.quik.model.Contact> original = value;
                value = new RealmList<dev.octoshrimpy.quik.model.Contact>();
                for (dev.octoshrimpy.quik.model.Contact item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealmOrUpdate(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.contactsColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                dev.octoshrimpy.quik.model.Contact linkedObject = value.get(i);
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
                dev.octoshrimpy.quik.model.Contact linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "ContactGroup", false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "contacts", RealmFieldType.LIST, "Contact");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactGroupColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ContactGroupColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ContactGroup";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ContactGroup";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.ContactGroup createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        dev.octoshrimpy.quik.model.ContactGroup obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
            ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("contacts")) {
                excludeFields.add("contacts");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.ContactGroup.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.ContactGroup.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) obj;
        if (json.has("title")) {
            if (json.isNull("title")) {
                objProxy.realmSet$title(null);
            } else {
                objProxy.realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("contacts")) {
            if (json.isNull("contacts")) {
                objProxy.realmSet$contacts(null);
            } else {
                objProxy.realmGet$contacts().clear();
                JSONArray array = json.getJSONArray("contacts");
                for (int i = 0; i < array.length(); i++) {
                    dev.octoshrimpy.quik.model.Contact item = dev_octoshrimpy_quik_model_ContactRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$contacts().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.ContactGroup createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.ContactGroup obj = new dev.octoshrimpy.quik.model.ContactGroup();
        final dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) obj;
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
            } else if (name.equals("title")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$title((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$title(null);
                }
            } else if (name.equals("contacts")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$contacts(null);
                } else {
                    objProxy.realmSet$contacts(new RealmList<dev.octoshrimpy.quik.model.Contact>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        dev.octoshrimpy.quik.model.Contact item = dev_octoshrimpy_quik_model_ContactRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$contacts().add(item);
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

    static dev_octoshrimpy_quik_model_ContactGroupRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.ContactGroup copyOrUpdate(Realm realm, ContactGroupColumnInfo columnInfo, dev.octoshrimpy.quik.model.ContactGroup object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.ContactGroup) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.ContactGroup realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.ContactGroup copy(Realm realm, ContactGroupColumnInfo columnInfo, dev.octoshrimpy.quik.model.ContactGroup newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.ContactGroup) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.titleColKey, unmanagedSource.realmGet$title());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<dev.octoshrimpy.quik.model.Contact> contactsUnmanagedList = unmanagedSource.realmGet$contacts();
        if (contactsUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.Contact> contactsManagedList = managedCopy.realmGet$contacts();
            contactsManagedList.clear();
            for (int i = 0; i < contactsUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.Contact contactsUnmanagedItem = contactsUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.Contact cachecontacts = (dev.octoshrimpy.quik.model.Contact) cache.get(contactsUnmanagedItem);
                if (cachecontacts != null) {
                    contactsManagedList.add(cachecontacts);
                } else {
                    contactsManagedList.add(dev_octoshrimpy_quik_model_ContactRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class), contactsUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.ContactGroup object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$title = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
        }

        RealmList<dev.octoshrimpy.quik.model.Contact> contactsList = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
        if (contactsList != null) {
            OsList contactsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.contactsColKey);
            for (dev.octoshrimpy.quik.model.Contact contactsItem : contactsList) {
                Long cacheItemIndexcontacts = cache.get(contactsItem);
                if (cacheItemIndexcontacts == null) {
                    cacheItemIndexcontacts = dev_octoshrimpy_quik_model_ContactRealmProxy.insert(realm, contactsItem, cache);
                }
                contactsOsList.addRow(cacheItemIndexcontacts);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.ContactGroup object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.ContactGroup) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$title = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
            }

            RealmList<dev.octoshrimpy.quik.model.Contact> contactsList = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
            if (contactsList != null) {
                OsList contactsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.contactsColKey);
                for (dev.octoshrimpy.quik.model.Contact contactsItem : contactsList) {
                    Long cacheItemIndexcontacts = cache.get(contactsItem);
                    if (cacheItemIndexcontacts == null) {
                        cacheItemIndexcontacts = dev_octoshrimpy_quik_model_ContactRealmProxy.insert(realm, contactsItem, cache);
                    }
                    contactsOsList.addRow(cacheItemIndexcontacts);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.ContactGroup object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        String realmGet$title = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleColKey, objKey, false);
        }

        OsList contactsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.contactsColKey);
        RealmList<dev.octoshrimpy.quik.model.Contact> contactsList = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
        if (contactsList != null && contactsList.size() == contactsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = contactsList.size();
            for (int i = 0; i < objectCount; i++) {
                dev.octoshrimpy.quik.model.Contact contactsItem = contactsList.get(i);
                Long cacheItemIndexcontacts = cache.get(contactsItem);
                if (cacheItemIndexcontacts == null) {
                    cacheItemIndexcontacts = dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                }
                contactsOsList.setRow(i, cacheItemIndexcontacts);
            }
        } else {
            contactsOsList.removeAll();
            if (contactsList != null) {
                for (dev.octoshrimpy.quik.model.Contact contactsItem : contactsList) {
                    Long cacheItemIndexcontacts = cache.get(contactsItem);
                    if (cacheItemIndexcontacts == null) {
                        cacheItemIndexcontacts = dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                    }
                    contactsOsList.addRow(cacheItemIndexcontacts);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.ContactGroup object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.ContactGroup) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            String realmGet$title = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, objKey, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleColKey, objKey, false);
            }

            OsList contactsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.contactsColKey);
            RealmList<dev.octoshrimpy.quik.model.Contact> contactsList = ((dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
            if (contactsList != null && contactsList.size() == contactsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = contactsList.size();
                for (int i = 0; i < objectCount; i++) {
                    dev.octoshrimpy.quik.model.Contact contactsItem = contactsList.get(i);
                    Long cacheItemIndexcontacts = cache.get(contactsItem);
                    if (cacheItemIndexcontacts == null) {
                        cacheItemIndexcontacts = dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                    }
                    contactsOsList.setRow(i, cacheItemIndexcontacts);
                }
            } else {
                contactsOsList.removeAll();
                if (contactsList != null) {
                    for (dev.octoshrimpy.quik.model.Contact contactsItem : contactsList) {
                        Long cacheItemIndexcontacts = cache.get(contactsItem);
                        if (cacheItemIndexcontacts == null) {
                            cacheItemIndexcontacts = dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                        }
                        contactsOsList.addRow(cacheItemIndexcontacts);
                    }
                }
            }

        }
    }

    public static dev.octoshrimpy.quik.model.ContactGroup createDetachedCopy(dev.octoshrimpy.quik.model.ContactGroup realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.ContactGroup unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.ContactGroup();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.ContactGroup) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.ContactGroup) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());

        // Deep copy of contacts
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$contacts(null);
        } else {
            RealmList<dev.octoshrimpy.quik.model.Contact> managedcontactsList = realmSource.realmGet$contacts();
            RealmList<dev.octoshrimpy.quik.model.Contact> unmanagedcontactsList = new RealmList<dev.octoshrimpy.quik.model.Contact>();
            unmanagedCopy.realmSet$contacts(unmanagedcontactsList);
            int nextDepth = currentDepth + 1;
            int size = managedcontactsList.size();
            for (int i = 0; i < size; i++) {
                dev.octoshrimpy.quik.model.Contact item = dev_octoshrimpy_quik_model_ContactRealmProxy.createDetachedCopy(managedcontactsList.get(i), nextDepth, maxDepth, cache);
                unmanagedcontactsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.ContactGroup update(Realm realm, ContactGroupColumnInfo columnInfo, dev.octoshrimpy.quik.model.ContactGroup realmObject, dev.octoshrimpy.quik.model.ContactGroup newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_ContactGroupRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.ContactGroup.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.titleColKey, realmObjectSource.realmGet$title());

        RealmList<dev.octoshrimpy.quik.model.Contact> contactsUnmanagedList = realmObjectSource.realmGet$contacts();
        if (contactsUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.Contact> contactsManagedCopy = new RealmList<dev.octoshrimpy.quik.model.Contact>();
            for (int i = 0; i < contactsUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.Contact contactsItem = contactsUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.Contact cachecontacts = (dev.octoshrimpy.quik.model.Contact) cache.get(contactsItem);
                if (cachecontacts != null) {
                    contactsManagedCopy.add(cachecontacts);
                } else {
                    contactsManagedCopy.add(dev_octoshrimpy_quik_model_ContactRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class), contactsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.contactsColKey, contactsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.contactsColKey, new RealmList<dev.octoshrimpy.quik.model.Contact>());
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
        StringBuilder stringBuilder = new StringBuilder("ContactGroup = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contacts:");
        stringBuilder.append("RealmList<Contact>[").append(realmGet$contacts().size()).append("]");
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
        dev_octoshrimpy_quik_model_ContactGroupRealmProxy aContactGroup = (dev_octoshrimpy_quik_model_ContactGroupRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aContactGroup.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContactGroup.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aContactGroup.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
