package com.mdsd.hotel.persistence;

import com.mdsd.hotel.persistence.model.AddressEntity;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.net.UnknownHostException;

/**
 * @author palmithor
 * @since 02/12/14.
 */
public class MongoDB {

    private static final Integer PORT = 10077;
    private static final String HOST = "dogen.mongohq.com";
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "​admin123";
    private static final String DB_NAME = "mdsd";

    private static Datastore datastore;
    private static Morphia morphia;
    private static MongoClient mongoClient;

    private MongoDB() {
    }

    private static MongoClient getMongoClient() {
        if (mongoClient == null) {
            MongoClientURI clientURI = new MongoClientURI("mongodb://dbuser:admin123@dogen.mongohq.com:10077/mdsd");
            try {
                mongoClient = new MongoClient(clientURI);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        return mongoClient;
    }

    public static Datastore getDatastore() {
        if (datastore == null) {
            initMorphia();
        }

        return datastore;
    }

    public static Morphia getMorphia() {
        if (morphia == null) {
            initMorphia();
        }

        return morphia;
    }


    private static void initMorphia() {
        morphia = new Morphia()
                .map(AddressEntity.class);
        datastore = morphia.createDatastore(getMongoClient(), DB_NAME);
    }
}