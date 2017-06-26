package org.mule.test.options.extension.connection;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.test.options.extension.OptionsConnection;

/**
 * Created by estebanwasinger on 6/24/17.
 */
public class AbstractConnectionProvider implements ConnectionProvider<OptionsConnection> {

    @Override
    public OptionsConnection connect() throws ConnectionException {
        return new OptionsConnection();
    }

    @Override
    public void disconnect(OptionsConnection connection) {

    }

    @Override
    public ConnectionValidationResult validate(OptionsConnection connection) {
        return ConnectionValidationResult.success();
    }

}
