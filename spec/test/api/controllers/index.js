var should = require('should');
var request = require('supertest');
var server = require('../../../app');

describe('controllers', function() {

  describe('index', function() {

    describe('GET /', function() {

      it('should return a default not found error', function(done) {

        request(server)
          .get('/')
          .set('Accept', 'application/json')
          .expect('Content-Type', /json/)
          .expect(404)
          .end(function(err, res) {
            should.not.exist(err);

            res.body.should.eql({
              "error": "Not Found",
              "statusCode": 404
            });

            done();
          });
      });

    });

  });

});
