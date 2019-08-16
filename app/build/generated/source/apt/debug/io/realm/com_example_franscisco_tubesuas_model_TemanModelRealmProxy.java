package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_franscisco_tubesuas_model_TemanModelRealmProxy extends com.example.franscisco.tubesuas.model.TemanModel
    implements RealmObjectProxy, com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface {

    static final class TemanModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long nimIndex;
        long telpIndex;
        long namaIndex;
        long kelasIndex;
        long emailIndex;
        long instagramIndex;
        long facebookIndex;

        TemanModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TemanModel");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nimIndex = addColumnDetails("nim", "nim", objectSchemaInfo);
            this.telpIndex = addColumnDetails("telp", "telp", objectSchemaInfo);
            this.namaIndex = addColumnDetails("nama", "nama", objectSchemaInfo);
            this.kelasIndex = addColumnDetails("kelas", "kelas", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.instagramIndex = addColumnDetails("instagram", "instagram", objectSchemaInfo);
            this.facebookIndex = addColumnDetails("facebook", "facebook", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TemanModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TemanModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TemanModelColumnInfo src = (TemanModelColumnInfo) rawSrc;
            final TemanModelColumnInfo dst = (TemanModelColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nimIndex = src.nimIndex;
            dst.telpIndex = src.telpIndex;
            dst.namaIndex = src.namaIndex;
            dst.kelasIndex = src.kelasIndex;
            dst.emailIndex = src.emailIndex;
            dst.instagramIndex = src.instagramIndex;
            dst.facebookIndex = src.facebookIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TemanModelColumnInfo columnInfo;
    private ProxyState<com.example.franscisco.tubesuas.model.TemanModel> proxyState;

    com_example_franscisco_tubesuas_model_TemanModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TemanModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.franscisco.tubesuas.model.TemanModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$nim() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.nimIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.nimIndex);
    }

    @Override
    public void realmSet$nim(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nimIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.nimIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nimIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.nimIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$telp() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.telpIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.telpIndex);
    }

    @Override
    public void realmSet$telp(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.telpIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.telpIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.telpIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.telpIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaIndex);
    }

    @Override
    public void realmSet$nama(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kelas() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kelasIndex);
    }

    @Override
    public void realmSet$kelas(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kelasIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kelasIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kelasIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kelasIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$instagram() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.instagramIndex);
    }

    @Override
    public void realmSet$instagram(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.instagramIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.instagramIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.instagramIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.instagramIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$facebook() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.facebookIndex);
    }

    @Override
    public void realmSet$facebook(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.facebookIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.facebookIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.facebookIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.facebookIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TemanModel", 8, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nim", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("telp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nama", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kelas", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("instagram", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("facebook", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TemanModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TemanModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TemanModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TemanModel";
    }

    @SuppressWarnings("cast")
    public static com.example.franscisco.tubesuas.model.TemanModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.franscisco.tubesuas.model.TemanModel obj = null;
        if (update) {
            Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
            TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.example.franscisco.tubesuas.model.TemanModel.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.franscisco.tubesuas.model.TemanModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_franscisco_tubesuas_model_TemanModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_franscisco_tubesuas_model_TemanModelRealmProxy) realm.createObjectInternal(com.example.franscisco.tubesuas.model.TemanModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_franscisco_tubesuas_model_TemanModelRealmProxy) realm.createObjectInternal(com.example.franscisco.tubesuas.model.TemanModel.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface objProxy = (com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) obj;
        if (json.has("nim")) {
            if (json.isNull("nim")) {
                objProxy.realmSet$nim(null);
            } else {
                objProxy.realmSet$nim((int) json.getInt("nim"));
            }
        }
        if (json.has("telp")) {
            if (json.isNull("telp")) {
                objProxy.realmSet$telp(null);
            } else {
                objProxy.realmSet$telp((int) json.getInt("telp"));
            }
        }
        if (json.has("nama")) {
            if (json.isNull("nama")) {
                objProxy.realmSet$nama(null);
            } else {
                objProxy.realmSet$nama((String) json.getString("nama"));
            }
        }
        if (json.has("kelas")) {
            if (json.isNull("kelas")) {
                objProxy.realmSet$kelas(null);
            } else {
                objProxy.realmSet$kelas((String) json.getString("kelas"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("instagram")) {
            if (json.isNull("instagram")) {
                objProxy.realmSet$instagram(null);
            } else {
                objProxy.realmSet$instagram((String) json.getString("instagram"));
            }
        }
        if (json.has("facebook")) {
            if (json.isNull("facebook")) {
                objProxy.realmSet$facebook(null);
            } else {
                objProxy.realmSet$facebook((String) json.getString("facebook"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.franscisco.tubesuas.model.TemanModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.franscisco.tubesuas.model.TemanModel obj = new com.example.franscisco.tubesuas.model.TemanModel();
        final com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface objProxy = (com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nim((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nim(null);
                }
            } else if (name.equals("telp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$telp((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$telp(null);
                }
            } else if (name.equals("nama")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama(null);
                }
            } else if (name.equals("kelas")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kelas((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kelas(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("instagram")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$instagram((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$instagram(null);
                }
            } else if (name.equals("facebook")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$facebook((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$facebook(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_example_franscisco_tubesuas_model_TemanModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.franscisco.tubesuas.model.TemanModel.class), false, Collections.<String>emptyList());
        io.realm.com_example_franscisco_tubesuas_model_TemanModelRealmProxy obj = new io.realm.com_example_franscisco_tubesuas_model_TemanModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.franscisco.tubesuas.model.TemanModel copyOrUpdate(Realm realm, TemanModelColumnInfo columnInfo, com.example.franscisco.tubesuas.model.TemanModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
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
            return (com.example.franscisco.tubesuas.model.TemanModel) cachedRealmObject;
        }

        com.example.franscisco.tubesuas.model.TemanModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
            long pkColumnIndex = columnInfo.idIndex;
            Number value = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_franscisco_tubesuas_model_TemanModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.franscisco.tubesuas.model.TemanModel copy(Realm realm, TemanModelColumnInfo columnInfo, com.example.franscisco.tubesuas.model.TemanModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.franscisco.tubesuas.model.TemanModel) cachedRealmObject;
        }

        com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface realmObjectSource = (com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.nimIndex, realmObjectSource.realmGet$nim());
        builder.addInteger(columnInfo.telpIndex, realmObjectSource.realmGet$telp());
        builder.addString(columnInfo.namaIndex, realmObjectSource.realmGet$nama());
        builder.addString(columnInfo.kelasIndex, realmObjectSource.realmGet$kelas());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.instagramIndex, realmObjectSource.realmGet$instagram());
        builder.addString(columnInfo.facebookIndex, realmObjectSource.realmGet$facebook());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_franscisco_tubesuas_model_TemanModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.example.franscisco.tubesuas.model.TemanModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.example.franscisco.tubesuas.model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        Object primaryKeyValue = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Number realmGet$nim = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
        }
        Number realmGet$telp = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$telp();
        if (realmGet$telp != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.telpIndex, rowIndex, realmGet$telp.longValue(), false);
        }
        String realmGet$nama = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
        }
        String realmGet$kelas = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$kelas();
        if (realmGet$kelas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
        }
        String realmGet$email = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$instagram = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$instagram();
        if (realmGet$instagram != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
        }
        String realmGet$facebook = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$facebook();
        if (realmGet$facebook != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.facebookIndex, rowIndex, realmGet$facebook, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.example.franscisco.tubesuas.model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.franscisco.tubesuas.model.TemanModel object = null;
        while (objects.hasNext()) {
            object = (com.example.franscisco.tubesuas.model.TemanModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Number realmGet$nim = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
            }
            Number realmGet$telp = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$telp();
            if (realmGet$telp != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.telpIndex, rowIndex, realmGet$telp.longValue(), false);
            }
            String realmGet$nama = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
            }
            String realmGet$kelas = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$kelas();
            if (realmGet$kelas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
            }
            String realmGet$email = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$instagram = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$instagram();
            if (realmGet$instagram != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
            }
            String realmGet$facebook = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$facebook();
            if (realmGet$facebook != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.facebookIndex, rowIndex, realmGet$facebook, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.franscisco.tubesuas.model.TemanModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.example.franscisco.tubesuas.model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        Object primaryKeyValue = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Number realmGet$nim = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
        }
        Number realmGet$telp = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$telp();
        if (realmGet$telp != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.telpIndex, rowIndex, realmGet$telp.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.telpIndex, rowIndex, false);
        }
        String realmGet$nama = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaIndex, rowIndex, false);
        }
        String realmGet$kelas = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$kelas();
        if (realmGet$kelas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kelasIndex, rowIndex, false);
        }
        String realmGet$email = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$instagram = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$instagram();
        if (realmGet$instagram != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.instagramIndex, rowIndex, false);
        }
        String realmGet$facebook = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$facebook();
        if (realmGet$facebook != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.facebookIndex, rowIndex, realmGet$facebook, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.facebookIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.example.franscisco.tubesuas.model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.franscisco.tubesuas.model.TemanModel object = null;
        while (objects.hasNext()) {
            object = (com.example.franscisco.tubesuas.model.TemanModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Number realmGet$nim = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
            }
            Number realmGet$telp = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$telp();
            if (realmGet$telp != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.telpIndex, rowIndex, realmGet$telp.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.telpIndex, rowIndex, false);
            }
            String realmGet$nama = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaIndex, rowIndex, false);
            }
            String realmGet$kelas = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$kelas();
            if (realmGet$kelas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kelasIndex, rowIndex, false);
            }
            String realmGet$email = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$instagram = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$instagram();
            if (realmGet$instagram != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.instagramIndex, rowIndex, false);
            }
            String realmGet$facebook = ((com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) object).realmGet$facebook();
            if (realmGet$facebook != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.facebookIndex, rowIndex, realmGet$facebook, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.facebookIndex, rowIndex, false);
            }
        }
    }

    public static com.example.franscisco.tubesuas.model.TemanModel createDetachedCopy(com.example.franscisco.tubesuas.model.TemanModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.franscisco.tubesuas.model.TemanModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.franscisco.tubesuas.model.TemanModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.franscisco.tubesuas.model.TemanModel) cachedObject.object;
            }
            unmanagedObject = (com.example.franscisco.tubesuas.model.TemanModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface unmanagedCopy = (com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) unmanagedObject;
        com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface realmSource = (com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$nim(realmSource.realmGet$nim());
        unmanagedCopy.realmSet$telp(realmSource.realmGet$telp());
        unmanagedCopy.realmSet$nama(realmSource.realmGet$nama());
        unmanagedCopy.realmSet$kelas(realmSource.realmGet$kelas());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$instagram(realmSource.realmGet$instagram());
        unmanagedCopy.realmSet$facebook(realmSource.realmGet$facebook());

        return unmanagedObject;
    }

    static com.example.franscisco.tubesuas.model.TemanModel update(Realm realm, TemanModelColumnInfo columnInfo, com.example.franscisco.tubesuas.model.TemanModel realmObject, com.example.franscisco.tubesuas.model.TemanModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface realmObjectTarget = (com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) realmObject;
        com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface realmObjectSource = (com_example_franscisco_tubesuas_model_TemanModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.franscisco.tubesuas.model.TemanModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.nimIndex, realmObjectSource.realmGet$nim());
        builder.addInteger(columnInfo.telpIndex, realmObjectSource.realmGet$telp());
        builder.addString(columnInfo.namaIndex, realmObjectSource.realmGet$nama());
        builder.addString(columnInfo.kelasIndex, realmObjectSource.realmGet$kelas());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.instagramIndex, realmObjectSource.realmGet$instagram());
        builder.addString(columnInfo.facebookIndex, realmObjectSource.realmGet$facebook());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TemanModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nim:");
        stringBuilder.append(realmGet$nim() != null ? realmGet$nim() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{telp:");
        stringBuilder.append(realmGet$telp() != null ? realmGet$telp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama:");
        stringBuilder.append(realmGet$nama() != null ? realmGet$nama() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kelas:");
        stringBuilder.append(realmGet$kelas() != null ? realmGet$kelas() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{instagram:");
        stringBuilder.append(realmGet$instagram() != null ? realmGet$instagram() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{facebook:");
        stringBuilder.append(realmGet$facebook() != null ? realmGet$facebook() : "null");
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
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_franscisco_tubesuas_model_TemanModelRealmProxy aTemanModel = (com_example_franscisco_tubesuas_model_TemanModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aTemanModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTemanModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aTemanModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
