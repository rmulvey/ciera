    @Override
    public void unrelate( int relNum, IModelInstance one, IModelInstance other, IModelInstance link ) throws XtumlException {
        switch( relNum ) {
${associative_unrelates}            default:
                throw new InstancePopulationException( "Relationship with number '" + relNum + "' not supported." );
        }
    }
    @Override
    public void unrelate( int relNum, IModelInstance one, IModelInstance other ) throws XtumlException {
        switch( relNum ) {
${other_unrelates}            default:
                throw new InstancePopulationException( "Relationship with number '" + relNum + "' not supported." );
        }
    }
