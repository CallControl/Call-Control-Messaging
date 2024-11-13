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
public class dev_octoshrimpy_quik_model_ConversationRealmProxy extends dev.octoshrimpy.quik.model.Conversation
    implements RealmObjectProxy, dev_octoshrimpy_quik_model_ConversationRealmProxyInterface {

    static final class ConversationColumnInfo extends ColumnInfo {
        long idColKey;
        long archivedColKey;
        long blockedColKey;
        long pinnedColKey;
        long recipientsColKey;
        long lastMessageColKey;
        long draftColKey;
        long blockingClientColKey;
        long blockReasonColKey;
        long nameColKey;

        ConversationColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Conversation");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.archivedColKey = addColumnDetails("archived", "archived", objectSchemaInfo);
            this.blockedColKey = addColumnDetails("blocked", "blocked", objectSchemaInfo);
            this.pinnedColKey = addColumnDetails("pinned", "pinned", objectSchemaInfo);
            this.recipientsColKey = addColumnDetails("recipients", "recipients", objectSchemaInfo);
            this.lastMessageColKey = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.draftColKey = addColumnDetails("draft", "draft", objectSchemaInfo);
            this.blockingClientColKey = addColumnDetails("blockingClient", "blockingClient", objectSchemaInfo);
            this.blockReasonColKey = addColumnDetails("blockReason", "blockReason", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
        }

        ConversationColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ConversationColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ConversationColumnInfo src = (ConversationColumnInfo) rawSrc;
            final ConversationColumnInfo dst = (ConversationColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.archivedColKey = src.archivedColKey;
            dst.blockedColKey = src.blockedColKey;
            dst.pinnedColKey = src.pinnedColKey;
            dst.recipientsColKey = src.recipientsColKey;
            dst.lastMessageColKey = src.lastMessageColKey;
            dst.draftColKey = src.draftColKey;
            dst.blockingClientColKey = src.blockingClientColKey;
            dst.blockReasonColKey = src.blockReasonColKey;
            dst.nameColKey = src.nameColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ConversationColumnInfo columnInfo;
    private ProxyState<dev.octoshrimpy.quik.model.Conversation> proxyState;
    private RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsRealmList;

    dev_octoshrimpy_quik_model_ConversationRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ConversationColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<dev.octoshrimpy.quik.model.Conversation>(this);
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
    public boolean realmGet$archived() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.archivedColKey);
    }

    @Override
    public void realmSet$archived(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.archivedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.archivedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$blocked() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.blockedColKey);
    }

    @Override
    public void realmSet$blocked(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.blockedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.blockedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$pinned() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.pinnedColKey);
    }

    @Override
    public void realmSet$pinned(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.pinnedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.pinnedColKey, value);
    }

    @Override
    public RealmList<dev.octoshrimpy.quik.model.Recipient> realmGet$recipients() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (recipientsRealmList != null) {
            return recipientsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.recipientsColKey);
            recipientsRealmList = new RealmList<dev.octoshrimpy.quik.model.Recipient>(dev.octoshrimpy.quik.model.Recipient.class, osList, proxyState.getRealm$realm());
            return recipientsRealmList;
        }
    }

    @Override
    public void realmSet$recipients(RealmList<dev.octoshrimpy.quik.model.Recipient> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("recipients")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<dev.octoshrimpy.quik.model.Recipient> original = value;
                value = new RealmList<dev.octoshrimpy.quik.model.Recipient>();
                for (dev.octoshrimpy.quik.model.Recipient item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealmOrUpdate(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.recipientsColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                dev.octoshrimpy.quik.model.Recipient linkedObject = value.get(i);
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
                dev.octoshrimpy.quik.model.Recipient linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    @Override
    public dev.octoshrimpy.quik.model.Message realmGet$lastMessage() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.lastMessageColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(dev.octoshrimpy.quik.model.Message.class, proxyState.getRow$realm().getLink(columnInfo.lastMessageColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$lastMessage(dev.octoshrimpy.quik.model.Message value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("lastMessage")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealmOrUpdate(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.lastMessageColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.lastMessageColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.lastMessageColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.lastMessageColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$draft() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.draftColKey);
    }

    @Override
    public void realmSet$draft(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'draft' to null.");
            }
            row.getTable().setString(columnInfo.draftColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'draft' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.draftColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$blockingClient() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.blockingClientColKey)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.blockingClientColKey);
    }

    @Override
    public void realmSet$blockingClient(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.blockingClientColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setLong(columnInfo.blockingClientColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.blockingClientColKey);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.blockingClientColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$blockReason() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.blockReasonColKey);
    }

    @Override
    public void realmSet$blockReason(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.blockReasonColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.blockReasonColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.blockReasonColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.blockReasonColKey, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Conversation", false, 10, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "archived", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "blocked", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "pinned", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "recipients", RealmFieldType.LIST, "Recipient");
        builder.addPersistedLinkProperty(NO_ALIAS, "lastMessage", RealmFieldType.OBJECT, "Message");
        builder.addPersistedProperty(NO_ALIAS, "draft", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "blockingClient", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "blockReason", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ConversationColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ConversationColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Conversation";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Conversation";
    }

    @SuppressWarnings("cast")
    public static dev.octoshrimpy.quik.model.Conversation createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        dev.octoshrimpy.quik.model.Conversation obj = null;
        if (update) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
            ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class), false, Collections.<String> emptyList());
                    obj = new io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("recipients")) {
                excludeFields.add("recipients");
            }
            if (json.has("lastMessage")) {
                excludeFields.add("lastMessage");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Conversation.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy) realm.createObjectInternal(dev.octoshrimpy.quik.model.Conversation.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final dev_octoshrimpy_quik_model_ConversationRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) obj;
        if (json.has("archived")) {
            if (json.isNull("archived")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'archived' to null.");
            } else {
                objProxy.realmSet$archived((boolean) json.getBoolean("archived"));
            }
        }
        if (json.has("blocked")) {
            if (json.isNull("blocked")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'blocked' to null.");
            } else {
                objProxy.realmSet$blocked((boolean) json.getBoolean("blocked"));
            }
        }
        if (json.has("pinned")) {
            if (json.isNull("pinned")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pinned' to null.");
            } else {
                objProxy.realmSet$pinned((boolean) json.getBoolean("pinned"));
            }
        }
        if (json.has("recipients")) {
            if (json.isNull("recipients")) {
                objProxy.realmSet$recipients(null);
            } else {
                objProxy.realmGet$recipients().clear();
                JSONArray array = json.getJSONArray("recipients");
                for (int i = 0; i < array.length(); i++) {
                    dev.octoshrimpy.quik.model.Recipient item = dev_octoshrimpy_quik_model_RecipientRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$recipients().add(item);
                }
            }
        }
        if (json.has("lastMessage")) {
            if (json.isNull("lastMessage")) {
                objProxy.realmSet$lastMessage(null);
            } else {
                dev.octoshrimpy.quik.model.Message lastMessageObj = dev_octoshrimpy_quik_model_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("lastMessage"), update);
                objProxy.realmSet$lastMessage(lastMessageObj);
            }
        }
        if (json.has("draft")) {
            if (json.isNull("draft")) {
                objProxy.realmSet$draft(null);
            } else {
                objProxy.realmSet$draft((String) json.getString("draft"));
            }
        }
        if (json.has("blockingClient")) {
            if (json.isNull("blockingClient")) {
                objProxy.realmSet$blockingClient(null);
            } else {
                objProxy.realmSet$blockingClient((int) json.getInt("blockingClient"));
            }
        }
        if (json.has("blockReason")) {
            if (json.isNull("blockReason")) {
                objProxy.realmSet$blockReason(null);
            } else {
                objProxy.realmSet$blockReason((String) json.getString("blockReason"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static dev.octoshrimpy.quik.model.Conversation createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final dev.octoshrimpy.quik.model.Conversation obj = new dev.octoshrimpy.quik.model.Conversation();
        final dev_octoshrimpy_quik_model_ConversationRealmProxyInterface objProxy = (dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) obj;
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
            } else if (name.equals("archived")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$archived((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'archived' to null.");
                }
            } else if (name.equals("blocked")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blocked((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'blocked' to null.");
                }
            } else if (name.equals("pinned")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pinned((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'pinned' to null.");
                }
            } else if (name.equals("recipients")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$recipients(null);
                } else {
                    objProxy.realmSet$recipients(new RealmList<dev.octoshrimpy.quik.model.Recipient>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        dev.octoshrimpy.quik.model.Recipient item = dev_octoshrimpy_quik_model_RecipientRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$recipients().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("lastMessage")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$lastMessage(null);
                } else {
                    dev.octoshrimpy.quik.model.Message lastMessageObj = dev_octoshrimpy_quik_model_MessageRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$lastMessage(lastMessageObj);
                }
            } else if (name.equals("draft")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$draft((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$draft(null);
                }
            } else if (name.equals("blockingClient")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blockingClient((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$blockingClient(null);
                }
            } else if (name.equals("blockReason")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blockReason((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$blockReason(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
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

    static dev_octoshrimpy_quik_model_ConversationRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class), false, Collections.<String>emptyList());
        io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy obj = new io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static dev.octoshrimpy.quik.model.Conversation copyOrUpdate(Realm realm, ConversationColumnInfo columnInfo, dev.octoshrimpy.quik.model.Conversation object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (dev.octoshrimpy.quik.model.Conversation) cachedRealmObject;
        }

        dev.octoshrimpy.quik.model.Conversation realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static dev.octoshrimpy.quik.model.Conversation copy(Realm realm, ConversationColumnInfo columnInfo, dev.octoshrimpy.quik.model.Conversation newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (dev.octoshrimpy.quik.model.Conversation) cachedRealmObject;
        }

        dev_octoshrimpy_quik_model_ConversationRealmProxyInterface unmanagedSource = (dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) newObject;

        Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addBoolean(columnInfo.archivedColKey, unmanagedSource.realmGet$archived());
        builder.addBoolean(columnInfo.blockedColKey, unmanagedSource.realmGet$blocked());
        builder.addBoolean(columnInfo.pinnedColKey, unmanagedSource.realmGet$pinned());
        builder.addString(columnInfo.draftColKey, unmanagedSource.realmGet$draft());
        builder.addInteger(columnInfo.blockingClientColKey, unmanagedSource.realmGet$blockingClient());
        builder.addString(columnInfo.blockReasonColKey, unmanagedSource.realmGet$blockReason());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsUnmanagedList = unmanagedSource.realmGet$recipients();
        if (recipientsUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsManagedList = managedCopy.realmGet$recipients();
            recipientsManagedList.clear();
            for (int i = 0; i < recipientsUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.Recipient recipientsUnmanagedItem = recipientsUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.Recipient cacherecipients = (dev.octoshrimpy.quik.model.Recipient) cache.get(recipientsUnmanagedItem);
                if (cacherecipients != null) {
                    recipientsManagedList.add(cacherecipients);
                } else {
                    recipientsManagedList.add(dev_octoshrimpy_quik_model_RecipientRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_RecipientRealmProxy.RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class), recipientsUnmanagedItem, update, cache, flags));
                }
            }
        }

        dev.octoshrimpy.quik.model.Message lastMessageObj = unmanagedSource.realmGet$lastMessage();
        if (lastMessageObj == null) {
            managedCopy.realmSet$lastMessage(null);
        } else {
            dev.octoshrimpy.quik.model.Message cachelastMessage = (dev.octoshrimpy.quik.model.Message) cache.get(lastMessageObj);
            if (cachelastMessage != null) {
                managedCopy.realmSet$lastMessage(cachelastMessage);
            } else {
                managedCopy.realmSet$lastMessage(dev_octoshrimpy_quik_model_MessageRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class), lastMessageObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, dev.octoshrimpy.quik.model.Conversation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

        RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsList = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null) {
            OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
            for (dev.octoshrimpy.quik.model.Recipient recipientsItem : recipientsList) {
                Long cacheItemIndexrecipients = cache.get(recipientsItem);
                if (cacheItemIndexrecipients == null) {
                    cacheItemIndexrecipients = dev_octoshrimpy_quik_model_RecipientRealmProxy.insert(realm, recipientsItem, cache);
                }
                recipientsOsList.addRow(cacheItemIndexrecipients);
            }
        }

        dev.octoshrimpy.quik.model.Message lastMessageObj = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
        if (lastMessageObj != null) {
            Long cachelastMessage = cache.get(lastMessageObj);
            if (cachelastMessage == null) {
                cachelastMessage = dev_octoshrimpy_quik_model_MessageRealmProxy.insert(realm, lastMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
        }
        String realmGet$draft = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$draft();
        if (realmGet$draft != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.draftColKey, objKey, realmGet$draft, false);
        }
        Number realmGet$blockingClient = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
        if (realmGet$blockingClient != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientColKey, objKey, realmGet$blockingClient.longValue(), false);
        }
        String realmGet$blockReason = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
        if (realmGet$blockReason != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.blockReasonColKey, objKey, realmGet$blockReason, false);
        }
        String realmGet$name = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.Conversation object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Conversation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

            RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsList = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null) {
                OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
                for (dev.octoshrimpy.quik.model.Recipient recipientsItem : recipientsList) {
                    Long cacheItemIndexrecipients = cache.get(recipientsItem);
                    if (cacheItemIndexrecipients == null) {
                        cacheItemIndexrecipients = dev_octoshrimpy_quik_model_RecipientRealmProxy.insert(realm, recipientsItem, cache);
                    }
                    recipientsOsList.addRow(cacheItemIndexrecipients);
                }
            }

            dev.octoshrimpy.quik.model.Message lastMessageObj = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
            if (lastMessageObj != null) {
                Long cachelastMessage = cache.get(lastMessageObj);
                if (cachelastMessage == null) {
                    cachelastMessage = dev_octoshrimpy_quik_model_MessageRealmProxy.insert(realm, lastMessageObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
            }
            String realmGet$draft = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$draft();
            if (realmGet$draft != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.draftColKey, objKey, realmGet$draft, false);
            }
            Number realmGet$blockingClient = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
            if (realmGet$blockingClient != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientColKey, objKey, realmGet$blockingClient.longValue(), false);
            }
            String realmGet$blockReason = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
            if (realmGet$blockReason != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.blockReasonColKey, objKey, realmGet$blockReason, false);
            }
            String realmGet$name = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, dev.octoshrimpy.quik.model.Conversation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

        OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
        RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsList = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null && recipientsList.size() == recipientsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = recipientsList.size();
            for (int i = 0; i < objectCount; i++) {
                dev.octoshrimpy.quik.model.Recipient recipientsItem = recipientsList.get(i);
                Long cacheItemIndexrecipients = cache.get(recipientsItem);
                if (cacheItemIndexrecipients == null) {
                    cacheItemIndexrecipients = dev_octoshrimpy_quik_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                }
                recipientsOsList.setRow(i, cacheItemIndexrecipients);
            }
        } else {
            recipientsOsList.removeAll();
            if (recipientsList != null) {
                for (dev.octoshrimpy.quik.model.Recipient recipientsItem : recipientsList) {
                    Long cacheItemIndexrecipients = cache.get(recipientsItem);
                    if (cacheItemIndexrecipients == null) {
                        cacheItemIndexrecipients = dev_octoshrimpy_quik_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                    }
                    recipientsOsList.addRow(cacheItemIndexrecipients);
                }
            }
        }


        dev.octoshrimpy.quik.model.Message lastMessageObj = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
        if (lastMessageObj != null) {
            Long cachelastMessage = cache.get(lastMessageObj);
            if (cachelastMessage == null) {
                cachelastMessage = dev_octoshrimpy_quik_model_MessageRealmProxy.insertOrUpdate(realm, lastMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.lastMessageColKey, objKey);
        }
        String realmGet$draft = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$draft();
        if (realmGet$draft != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.draftColKey, objKey, realmGet$draft, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.draftColKey, objKey, false);
        }
        Number realmGet$blockingClient = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
        if (realmGet$blockingClient != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientColKey, objKey, realmGet$blockingClient.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.blockingClientColKey, objKey, false);
        }
        String realmGet$blockReason = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
        if (realmGet$blockReason != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.blockReasonColKey, objKey, realmGet$blockReason, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.blockReasonColKey, objKey, false);
        }
        String realmGet$name = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class);
        long pkColumnKey = columnInfo.idColKey;
        dev.octoshrimpy.quik.model.Conversation object = null;
        while (objects.hasNext()) {
            object = (dev.octoshrimpy.quik.model.Conversation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedColKey, objKey, ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

            OsList recipientsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.recipientsColKey);
            RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsList = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null && recipientsList.size() == recipientsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = recipientsList.size();
                for (int i = 0; i < objectCount; i++) {
                    dev.octoshrimpy.quik.model.Recipient recipientsItem = recipientsList.get(i);
                    Long cacheItemIndexrecipients = cache.get(recipientsItem);
                    if (cacheItemIndexrecipients == null) {
                        cacheItemIndexrecipients = dev_octoshrimpy_quik_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                    }
                    recipientsOsList.setRow(i, cacheItemIndexrecipients);
                }
            } else {
                recipientsOsList.removeAll();
                if (recipientsList != null) {
                    for (dev.octoshrimpy.quik.model.Recipient recipientsItem : recipientsList) {
                        Long cacheItemIndexrecipients = cache.get(recipientsItem);
                        if (cacheItemIndexrecipients == null) {
                            cacheItemIndexrecipients = dev_octoshrimpy_quik_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                        }
                        recipientsOsList.addRow(cacheItemIndexrecipients);
                    }
                }
            }


            dev.octoshrimpy.quik.model.Message lastMessageObj = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
            if (lastMessageObj != null) {
                Long cachelastMessage = cache.get(lastMessageObj);
                if (cachelastMessage == null) {
                    cachelastMessage = dev_octoshrimpy_quik_model_MessageRealmProxy.insertOrUpdate(realm, lastMessageObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.lastMessageColKey, objKey);
            }
            String realmGet$draft = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$draft();
            if (realmGet$draft != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.draftColKey, objKey, realmGet$draft, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.draftColKey, objKey, false);
            }
            Number realmGet$blockingClient = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
            if (realmGet$blockingClient != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientColKey, objKey, realmGet$blockingClient.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.blockingClientColKey, objKey, false);
            }
            String realmGet$blockReason = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
            if (realmGet$blockReason != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.blockReasonColKey, objKey, realmGet$blockReason, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.blockReasonColKey, objKey, false);
            }
            String realmGet$name = ((dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
        }
    }

    public static dev.octoshrimpy.quik.model.Conversation createDetachedCopy(dev.octoshrimpy.quik.model.Conversation realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        dev.octoshrimpy.quik.model.Conversation unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new dev.octoshrimpy.quik.model.Conversation();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (dev.octoshrimpy.quik.model.Conversation) cachedObject.object;
            }
            unmanagedObject = (dev.octoshrimpy.quik.model.Conversation) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        dev_octoshrimpy_quik_model_ConversationRealmProxyInterface unmanagedCopy = (dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) unmanagedObject;
        dev_octoshrimpy_quik_model_ConversationRealmProxyInterface realmSource = (dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$archived(realmSource.realmGet$archived());
        unmanagedCopy.realmSet$blocked(realmSource.realmGet$blocked());
        unmanagedCopy.realmSet$pinned(realmSource.realmGet$pinned());

        // Deep copy of recipients
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$recipients(null);
        } else {
            RealmList<dev.octoshrimpy.quik.model.Recipient> managedrecipientsList = realmSource.realmGet$recipients();
            RealmList<dev.octoshrimpy.quik.model.Recipient> unmanagedrecipientsList = new RealmList<dev.octoshrimpy.quik.model.Recipient>();
            unmanagedCopy.realmSet$recipients(unmanagedrecipientsList);
            int nextDepth = currentDepth + 1;
            int size = managedrecipientsList.size();
            for (int i = 0; i < size; i++) {
                dev.octoshrimpy.quik.model.Recipient item = dev_octoshrimpy_quik_model_RecipientRealmProxy.createDetachedCopy(managedrecipientsList.get(i), nextDepth, maxDepth, cache);
                unmanagedrecipientsList.add(item);
            }
        }

        // Deep copy of lastMessage
        unmanagedCopy.realmSet$lastMessage(dev_octoshrimpy_quik_model_MessageRealmProxy.createDetachedCopy(realmSource.realmGet$lastMessage(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$draft(realmSource.realmGet$draft());
        unmanagedCopy.realmSet$blockingClient(realmSource.realmGet$blockingClient());
        unmanagedCopy.realmSet$blockReason(realmSource.realmGet$blockReason());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        return unmanagedObject;
    }

    static dev.octoshrimpy.quik.model.Conversation update(Realm realm, ConversationColumnInfo columnInfo, dev.octoshrimpy.quik.model.Conversation realmObject, dev.octoshrimpy.quik.model.Conversation newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        dev_octoshrimpy_quik_model_ConversationRealmProxyInterface realmObjectTarget = (dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) realmObject;
        dev_octoshrimpy_quik_model_ConversationRealmProxyInterface realmObjectSource = (dev_octoshrimpy_quik_model_ConversationRealmProxyInterface) newObject;
        Table table = realm.getTable(dev.octoshrimpy.quik.model.Conversation.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addBoolean(columnInfo.archivedColKey, realmObjectSource.realmGet$archived());
        builder.addBoolean(columnInfo.blockedColKey, realmObjectSource.realmGet$blocked());
        builder.addBoolean(columnInfo.pinnedColKey, realmObjectSource.realmGet$pinned());

        RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsUnmanagedList = realmObjectSource.realmGet$recipients();
        if (recipientsUnmanagedList != null) {
            RealmList<dev.octoshrimpy.quik.model.Recipient> recipientsManagedCopy = new RealmList<dev.octoshrimpy.quik.model.Recipient>();
            for (int i = 0; i < recipientsUnmanagedList.size(); i++) {
                dev.octoshrimpy.quik.model.Recipient recipientsItem = recipientsUnmanagedList.get(i);
                dev.octoshrimpy.quik.model.Recipient cacherecipients = (dev.octoshrimpy.quik.model.Recipient) cache.get(recipientsItem);
                if (cacherecipients != null) {
                    recipientsManagedCopy.add(cacherecipients);
                } else {
                    recipientsManagedCopy.add(dev_octoshrimpy_quik_model_RecipientRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_RecipientRealmProxy.RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class), recipientsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.recipientsColKey, recipientsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.recipientsColKey, new RealmList<dev.octoshrimpy.quik.model.Recipient>());
        }

        dev.octoshrimpy.quik.model.Message lastMessageObj = realmObjectSource.realmGet$lastMessage();
        if (lastMessageObj == null) {
            builder.addNull(columnInfo.lastMessageColKey);
        } else {
            dev.octoshrimpy.quik.model.Message cachelastMessage = (dev.octoshrimpy.quik.model.Message) cache.get(lastMessageObj);
            if (cachelastMessage != null) {
                builder.addObject(columnInfo.lastMessageColKey, cachelastMessage);
            } else {
                builder.addObject(columnInfo.lastMessageColKey, dev_octoshrimpy_quik_model_MessageRealmProxy.copyOrUpdate(realm, (dev_octoshrimpy_quik_model_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class), lastMessageObj, true, cache, flags));
            }
        }
        builder.addString(columnInfo.draftColKey, realmObjectSource.realmGet$draft());
        builder.addInteger(columnInfo.blockingClientColKey, realmObjectSource.realmGet$blockingClient());
        builder.addString(columnInfo.blockReasonColKey, realmObjectSource.realmGet$blockReason());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Conversation = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{archived:");
        stringBuilder.append(realmGet$archived());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blocked:");
        stringBuilder.append(realmGet$blocked());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pinned:");
        stringBuilder.append(realmGet$pinned());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipients:");
        stringBuilder.append("RealmList<Recipient>[").append(realmGet$recipients().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastMessage:");
        stringBuilder.append(realmGet$lastMessage() != null ? "Message" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{draft:");
        stringBuilder.append(realmGet$draft());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blockingClient:");
        stringBuilder.append(realmGet$blockingClient() != null ? realmGet$blockingClient() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blockReason:");
        stringBuilder.append(realmGet$blockReason() != null ? realmGet$blockReason() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
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
        dev_octoshrimpy_quik_model_ConversationRealmProxy aConversation = (dev_octoshrimpy_quik_model_ConversationRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aConversation.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aConversation.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aConversation.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
